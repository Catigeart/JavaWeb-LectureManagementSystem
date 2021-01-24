package com.uma.lecture.web;

import com.uma.lecture.domain.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 0:06 2021/1/20
 */

public abstract class BaseLoginFilter implements Filter {

    public abstract String getType();

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        User user = (User) request.getSession().getAttribute("user");

        String action = request.getParameter("action");

        if (user != null && !user.getType().equals(getType()) ||
                user == null && !"login".equals(action) && !"init".equals(action)) { // 没有登录
            request.getSession().removeAttribute("user");
            response.sendRedirect("login.jsp?action=init");
        }
        chain.doFilter(req, resp);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
    }

}
