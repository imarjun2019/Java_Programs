package com.esgyn.aop_demo;

import com.esgyn.aop_demo.bean.User;
import com.esgyn.aop_demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class AopDemoApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void add() {
        log.warn("test add user...");
        userService.add(new User("xulei1", "xulei1password"));
        log.warn("------------------");
    }


    @Test
    public void delete () {
        log.warn("test delete user...");
        try {
            userService.delete(new User("xulei1", "xulei1password"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.warn("------------------");
    }

}
