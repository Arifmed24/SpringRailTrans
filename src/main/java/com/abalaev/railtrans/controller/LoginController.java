package com.abalaev.railtrans.controller;

import com.abalaev.railtrans.model.RoleEnum;
import com.abalaev.railtrans.model.User;
import com.abalaev.railtrans.service.api.UserService;
import com.abalaev.railtrans.validator.ValidationUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class LoginController {

    private static final Logger LOG = LogManager.getLogger(LoginController.class);
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView loginPageForm(){
        return new ModelAndView("/login");
    }

    @RequestMapping(value = {"/logSuccess"}, method = RequestMethod.GET)
    public String loginSuccess(HttpSession session) {
        String login = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userService.findUserByLogin(login);
        session.setAttribute("user", user);

        return "redirect:/findway";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView registrationPageForm(){
        return new ModelAndView("/registration");
    }
}
