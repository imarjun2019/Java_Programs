package com.esgyn.aop_demo.service.impl;

import com.esgyn.aop_demo.bean.User;
import com.esgyn.aop_demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Override
    public Boolean add(User user) {
        log.info("Add users...");
        return false;
    }

    @Override
    public User query() {
        log.info("query user info");
        return new User("xulei","xulei");
    }

    @Override
    public Boolean delete (User user) throws Exception{
        log.info("delete user");
        throw new Exception("delete user failed");
//        return true;
    }

    @Override
    public User modify (User user) {
        log.info("Modify user");
        return user;
    }

}
