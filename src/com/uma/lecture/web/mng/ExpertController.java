package com.uma.lecture.web.mng;

import com.uma.lecture.domain.Expert;
import com.uma.lecture.service.ExpertService;
import com.uma.lecture.service.impl.ExpertServiceImpl;

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
 * Date: 19:01 2021/1/18
 */
@WebServlet("/mng/expert")
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
            List<Expert> le = expertService.findAllExpert();
            request.setAttribute("expertList", le);
            request.getRequestDispatcher("expert.jsp").forward(request, response);
        }
    }
}
