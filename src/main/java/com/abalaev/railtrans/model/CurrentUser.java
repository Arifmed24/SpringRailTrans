package com.abalaev.railtrans.model;

import org.springframework.security.core.authority.AuthorityUtils;

public class CurrentUser extends org.springframework.security.core.userdetails.User{
    private User user;

    public CurrentUser(User user){
        super(user.getLogin(),user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole().toString()));
        this.user=user;
        this.user.setFio(user.getFio());
    }
    public User getUser() {return user;}
    public RoleEnum getRole() {return user.getRole();}
}
