package com.uma.lecture.web.mng;

import com.uma.lecture.web.BaseUserController;

import javax.servlet.annotation.WebServlet;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 21:08 2021/1/16
 */
@WebServlet(urlPatterns = {"/mng/user"})
public class UserController extends BaseUserController {

    @Override
    public String getType() {
        return "管理人员";
    }

}
