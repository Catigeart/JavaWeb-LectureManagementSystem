package com.uma.lecture.web.worker;

import com.mysql.cj.util.DnsSrv;
import com.uma.lecture.domain.Expert;
import com.uma.lecture.service.ExpertService;
import com.uma.lecture.service.impl.ExpertServiceImpl;
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
 * Date: 19:01 2021/1/18
 */
@WebServlet("/worker/expert")
public class ExpertController extends HttpServlet {

    private ExpertService expertService = new ExpertServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action.equals("get")) {
            // System.out.println("get flag");
            List<Expert> le = expertService.findAllExpert();
            request.setAttribute("expertList", le);
            request.getRequestDispatcher("expert.jsp").forward(request, response);
        } else if (action.equals("post")) {
            // 获取前端信息
            String id = StrUtil.removeNull(request.getParameter("id"));
            String name = StrUtil.removeNull(request.getParameter("name"));
            String sex = StrUtil.removeNull(request.getParameter("sex"));
            String area = StrUtil.removeNull(request.getParameter("area"));
            String organizationId = StrUtil.removeNull(request.getParameter("organizationId"));
            String job = StrUtil.removeNull(request.getParameter("job"));
            String location = StrUtil.removeNull(request.getParameter("location"));
            String phone = StrUtil.removeNull(request.getParameter("phone"));
            String email = StrUtil.removeNull(request.getParameter("email"));

            // 服务器验证
            List<String> errors = new ArrayList<>();
            if (!StrUtil.hasLength(name)) {
                errors.add("姓名不能为空！");
            }
            if (!StrUtil.hasLength(sex)) {
                errors.add("性别不能为空！");
            }
            if (!StrUtil.hasLength(phone)) {
                errors.add("手机不能为空！");
            }
            if (!StrUtil.hasLength(email)) {
                errors.add("邮箱不能为空！");
            }
            if (!StrUtil.hasLength(area)) {
                errors.add("领域不能为空！");
            }

            // 初始化专家对象
            Expert expert = new Expert();
            expert.setId(id);
            expert.setName(name);
            expert.setSex(sex);
            expert.setArea(area);
            expert.setJob(job);
            expert.setAddress(location); // 变量不统一，懒得改了
            expert.setPhone(phone);
            expert.setEmail(email);

            // 判断是更新现有专家还是新增专家

            if (StrUtil.hasLength(id) && expertService.isExistId(id)) { // 更新现有专家
                if (!expertService.updateExpert(expert, organizationId)) {
                    errors.add("专家更新失败！");
                }
            } else { // 新增专家
                if (!expertService.addExpert(expert, organizationId)) {
                    errors.add("专家新增失败！");
                }
            }

            if (errors.size() > 0) {
                request.setAttribute("errors", errors);
                request.getRequestDispatcher("expert_update.jsp").forward(request, response);
            }
            request.getRequestDispatcher("expert_update.jsp").forward(request, response);

        }
    }
}
