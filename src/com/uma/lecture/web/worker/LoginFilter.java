package com.uma.lecture.web.worker;

import com.uma.lecture.web.BaseLoginFilter;

import javax.servlet.annotation.WebFilter;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 0:12 2021/1/20
 */
@WebFilter("/worker/*")
public class LoginFilter extends BaseLoginFilter {

    @Override
    public String getType() {
        return "工作人员";
    }

}
