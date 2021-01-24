package com.uma.lecture.web.worker;

import javax.servlet.annotation.WebServlet;

import com.uma.lecture.web.BaseUserController;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 21:08 2021/1/16
 */
@WebServlet(urlPatterns = {"/worker/user"})
public class UserController extends BaseUserController {
    @Override
    public String getType() {
        return "工作人员";
    }
}
