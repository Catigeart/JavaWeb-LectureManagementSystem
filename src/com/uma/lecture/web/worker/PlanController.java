package com.uma.lecture.web.worker;

import com.uma.lecture.domain.Expert;
import com.uma.lecture.domain.Plan;
import com.uma.lecture.service.ExpertService;
import com.uma.lecture.service.PlanService;
import com.uma.lecture.service.impl.ExpertServiceImpl;
import com.uma.lecture.service.impl.PlanServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 22:22 2021/1/21
 */
@WebServlet("/worker/plan")
public class PlanController extends HttpServlet {

    private PlanService planService = new PlanServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action.equals("get")) {
            // System.out.println("get flag");
            List<Plan> lp = planService.findAllPlan();
            request.setAttribute("planList", lp);
            request.getRequestDispatcher("plan.jsp").forward(request, response);
        }
    }
}