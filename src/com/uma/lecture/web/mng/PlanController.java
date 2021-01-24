package com.uma.lecture.web.mng;

import com.uma.lecture.domain.Plan;
import com.uma.lecture.service.PlanService;
import com.uma.lecture.service.impl.PlanServiceImpl;
import com.uma.lecture.util.StrUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 18:33 2021/1/18
 */
@WebServlet("/mng/plan")
public class PlanController extends HttpServlet {

    private PlanService planService = new PlanServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action.equals("post")) {

            List<String> errors = new ArrayList<>();

            // 读取前端数据
            String topic = StrUtil.removeNull(request.getParameter("topic"));
            String location = StrUtil.removeNull(request.getParameter("location"));
            String time = StrUtil.removeNull(request.getParameter("time"));
            String description = StrUtil.removeNull(request.getParameter("description"));
            String expert = StrUtil.removeNull(request.getParameter("expert"));
            String expertDescription = StrUtil.removeNull(request.getParameter("expertDescription"));

            Plan plan = new Plan();
            plan.setTopic(topic);
            plan.setLocation(location);
            plan.setTime(time);
            plan.setDescription(description);
            plan.setExpert(expert);
            plan.setExpertDescription(expertDescription);
            plan.setDone(false);

            // 服务器端验证
            if (!StrUtil.hasLength(topic)) {
                errors.add("主题不能为空！");
            }
            if (!StrUtil.hasLength(location)) {
                errors.add("地点不能为空！");
            }
            if (!StrUtil.hasLength(time)) {
                errors.add("时间不能为空！");
            }
            if (!StrUtil.hasLength(expert)) {
                errors.add("专家不能为空！");
            }

            // 保存计划信息
            if (!planService.add(plan)) {
                errors.add("新建计划失败！");
            }
            if (errors.size() > 0) {
                request.setAttribute("errors", errors);
                request.getRequestDispatcher("plan.jsp").forward(request, response);
            }
            request.getRequestDispatcher("plan.jsp").forward(request, response);
        }

    }
}
