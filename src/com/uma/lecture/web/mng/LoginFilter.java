package com.uma.lecture.web.mng;

import com.uma.lecture.web.BaseLoginFilter;

import javax.servlet.annotation.WebFilter;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 0:13 2021/1/20
 */
@WebFilter("/mng/*")
public class LoginFilter extends BaseLoginFilter {

    @Override
    public String getType() {
        return "管理人员";
    }

}
