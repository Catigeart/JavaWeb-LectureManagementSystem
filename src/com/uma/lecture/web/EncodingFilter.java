package com.uma.lecture.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 15:19 2020/11/23
 */
@WebFilter("/*")
public class EncodingFilter implements Filter {

    @Override
    public void init(FilterConfig config) {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {
    }

}
