//package com.abalaev.railtrans.presentation;
//
//import com.abalaev.railtrans.configuration.AppConfig;
//import com.abalaev.railtrans.model.RoleEnum;
//import com.abalaev.railtrans.model.User;
//import com.abalaev.railtrans.service.api.UserService;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
//
//public class Main {
//    public static void main(String[] args) {
//        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        UserService service = (UserService) context.getBean("userService");
//
//        User user1 = new User();
//        user1.setLogin("login1");
//        user1.setFio("spring");
//        user1.setPassword("qwe");
//        user1.setRole(RoleEnum.USER);
//
//        service.create(user1);
//    }
//}
