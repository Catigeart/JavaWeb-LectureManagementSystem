package com.uma.lecture.web.student;

import com.uma.lecture.web.BaseLoginFilter;

import javax.servlet.annotation.WebFilter;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 0:10 2021/1/20
 */
@WebFilter("/student/*")
public class LoginFilter extends BaseLoginFilter {

    @Override
    public String getType() {
        return "开发人员";
    }

}
