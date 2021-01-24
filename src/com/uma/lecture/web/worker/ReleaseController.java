package com.uma.lecture.web.worker;

import com.uma.lecture.domain.*;
import com.uma.lecture.service.*;
import com.uma.lecture.service.impl.*;
import com.uma.lecture.util.StrUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 9:37 2021/1/17
 */
@WebServlet(urlPatterns = {"/worker/release"})
public class ReleaseController extends HttpServlet {

    private ReleaseService releaseService = new ReleaseServiceImpl();
    private LectureService lectureService = new LectureServiceImpl();
    private PlanService planService = new PlanServiceImpl();
    private EmailService emailService = new EmailServiceImpl();
    private ExpertService expertService = new ExpertServiceImpl();
    private WebsiteService websiteService = new WebsiteServiceImpl();
    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
    private StudentService studentService = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action.equals("post")) {

            List<String> info = new ArrayList<>();

            // 获取前端数据
            String planId = StrUtil.removeNull(request.getParameter("planId"));
            String name = StrUtil.removeNull(request.getParameter("name"));
            String topic = StrUtil.removeNull(request.getParameter("topic"));
            String expertId = StrUtil.removeNull(request.getParameter("expertId"));
            String host = StrUtil.removeNull(request.getParameter("host"));
            Integer studentNumber = 0;
            Integer maxStudentNumber = Integer.parseInt(StrUtil.removeNull(request.getParameter("maxStudentNumber")));
            String strBeginDate = StrUtil.removeNull(request.getParameter("beginDate"));
            String strBeginTime = StrUtil.removeNull(request.getParameter("beginTime"));
            String strBegin = strBeginDate + " " + strBeginTime;
            String strEndDate = StrUtil.removeNull(request.getParameter("endDate"));
            String strEndTime = StrUtil.removeNull(request.getParameter("endTime"));
            String strEnd = strEndDate + " " + strEndTime;
            String location = StrUtil.removeNull(request.getParameter("location"));
            String introduction = StrUtil.removeNull(request.getParameter("introduction"));
            String strLatestDate = StrUtil.removeNull(request.getParameter("latestDate"));
            Integer workingYear = Integer.parseInt(StrUtil.removeNull(request.getParameter("workingYear")));
            String job = StrUtil.removeNull(request.getParameter("job"));

            // 服务端验证
            if (!StrUtil.hasLength(planId)) {
                info.add("计划编号不能为空！");
            }
            if (!StrUtil.hasLength(name)) {
                info.add("名称不能为空！");
            }
            if (!StrUtil.hasLength(expertId)) {
                info.add("专家不能为空！");
            }
            if (!StrUtil.hasLength(topic)) {
                info.add("主题不能为空！");
            }
            if (!StrUtil.hasLength(location)) {
                info.add("地点不能为空！");
            }
            if (info.size() > 0) {
                request.setAttribute("errors", info);
                request.getRequestDispatcher("release.jsp").forward(request, response);
            }

            Date beginTime = null;
            Date endTime = null;
            Date latestDate = null;
            try {
                beginTime = dateFormat.parse(strBegin);
                endTime = dateFormat.parse(strEnd);
                latestDate = dateFormat2.parse(strLatestDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            // 插入讲座信息
            Lecture lecture = new Lecture();
            lecture.setPlanId(planId);
            lecture.setName(name);
            lecture.setTopic(topic);
            Expert expert = expertService.findByPk(expertId);
            lecture.setExpert(expert);
            lecture.setHost(host);
            lecture.setLocation(location);
            lecture.setIntroduction(introduction);
            lecture.setStudentNumber(studentNumber);
            lecture.setMaxStudentNumber(maxStudentNumber);
            lecture.setBeginTime(beginTime);
            lecture.setEndTime(endTime);
            EntryRequirement entryRequirement = new EntryRequirement();
            entryRequirement.setLatestDate(latestDate);
            entryRequirement.setJob(job);
            entryRequirement.setWorkingYear(workingYear);
            lecture.setEntryRequirement(entryRequirement);
            if (!lectureService.add(lecture)) {
                info.add("保存讲座信息失败！");
                request.setAttribute("errors", info);
                request.getRequestDispatcher("release.jsp").forward(request, response);
            }

            // 更新计划落实情况
            if (planService.updatePlanIsDone(planId)) {
                info.add("警告：计划落实情况更新失败！");
                request.setAttribute("errors", info);
            }

            // 发布讲座
            Release release = new Release();
            User user = (User) request.getSession().getAttribute("user");
            String workerName = user.getUsername();
            String lectureId = lectureService.findByTopic(lecture).getId();
            Date time = new Date();
            release.setWorkerName(workerName);
            release.setTime(time);
            release.setLectureId(lectureId);
            List<String> studentIdList = studentService.findStudentIdOfLecture(lectureId);
            boolean sendEmail = emailService.sendEmail(studentIdList);
            if (!sendEmail) {
                info.add("警告：邮件发送失败！");
            }
            boolean sendWebSite = websiteService.sendWebsite(release);
            if(!sendWebSite) {
                info.add("警告：网页生成失败！");
            }
            release.setSentEmail(sendEmail);
            release.setSentWebsite(sendWebSite);

            // 保存发布情况
            if (releaseService.save(release)) {
                info.add("警告：发布情况保存失败！");
            }

            // 网页跳转
            if (info.size() > 0) {
                request.setAttribute("errors", info);
            }
            request.getRequestDispatcher("release.jsp").forward(request, response);
        } else if (action.equals("get")) {
            String planId = StrUtil.removeNull(request.getParameter("planId"));
            // TODO
        }
    }
}
