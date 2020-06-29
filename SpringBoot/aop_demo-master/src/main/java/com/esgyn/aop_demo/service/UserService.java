package com.esgyn.aop_demo.service;

import com.esgyn.aop_demo.bean.User;

public interface UserService {

    public Boolean add(User user);

    public User query();

    public Boolean delete (User user) throws Exception;

    public User modify (User user);
}
