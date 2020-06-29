package com.esgyn.aop_demo.bean;

import lombok.Data;

@Data
public class User {

    String user;
    String password;

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }
}
