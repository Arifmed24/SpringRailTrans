package com.abalaev.railtrans.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AccessFilter implements Filter{

    private static final Logger LOG = LogManager.getLogger(AccessFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession();

//        if (session != null) {
//            User user = (User) session.getAttribute("user");
//            if (user != null) {
//                if (user.getRole() == RoleEnum.ADMIN) {
//                    LOG.info("Admin access");
//                    chain.doFilter(request, response);
//                } else {
//                    LOG.info("User access");
//                    res.sendRedirect("/findway");
//                }
//            } else {
//                res.sendRedirect("/login");
//            }
//        } else {
//            res.sendRedirect("/login");
//        }
    }

    @Override
    public void destroy() {

    }
}
