package com.uma.lecture.web;

import com.uma.lecture.domain.User;
import com.uma.lecture.service.UserService;
import com.uma.lecture.service.impl.UserServiceImpl;
import com.uma.lecture.util.StrUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 21:08 2021/1/16
 */

public abstract class BaseUserController extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    public abstract String getType();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action.equals("login")) {
            String username = StrUtil.removeNull(request.getParameter("username"));
            String password = StrUtil.removeNull(request.getParameter("password"));
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setType(getType());
            if (userService.login(user)) { // 登录成功
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                response.sendRedirect("main.jsp");
            } else { // 登录失败
                List<String> errors = new ArrayList<>();
                errors.add("您输入的客户账号或密码不正确！");
                request.setAttribute("errors", errors);
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } else if (action.equals("register")) { // 只有开发人员可以注册
            String username = StrUtil.removeNull(request.getParameter("username"));
            String password = StrUtil.removeNull(request.getParameter("password"));
            String password2 = StrUtil.removeNull(request.getParameter("password2"));
            String type = StrUtil.removeNull(request.getParameter("type"));
            String sex = StrUtil.removeNull(request.getParameter("nickname"));
            String nickname = StrUtil.removeNull(request.getParameter("name"));
            String name = StrUtil.removeNull(request.getParameter("phone"));
            String phone = StrUtil.removeNull(request.getParameter("email"));

            // 服务器端验证
            List<String> info = new ArrayList<>();
            if (!StrUtil.hasLength(username)) {
                info.add("客户账号不能为空！");
            }
            if (password == null || password2 == null || !password.equals(password2)) {
                info.add("两次输入的密码不一致！");
            }
            if (info.size() > 0) { // 验证失败
                request.setAttribute("errors", info);
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }

            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setType(type);
            user.setSex(sex);
            user.setNickname(nickname);
            user.setName(name);
            user.setPhone(phone);
            if (userService.register(user)) {
                info.add("注册成功！");
            } else {
                info.add("注册失败！");
            }
            request.setAttribute("errors", info);
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else if (action.equals("logout")) {
            request.getSession().removeAttribute("user");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
/*
    private String getHttpType(HttpServletRequest request) {
        String url = request.getRequestURL().toString();
        String postType = null;
        if (url.endsWith("/"))
            url = url.substring(0, url.length() - 1);
        postType = url.substring(url.lastIndexOf('/') + 1);
        return postType;
    }
*/
}
