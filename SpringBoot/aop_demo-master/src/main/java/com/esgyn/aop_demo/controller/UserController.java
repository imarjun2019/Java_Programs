package com.esgyn.aop_demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(path="/api/login", method=RequestMethod.GET)
    public boolean login() {
        return false;
    }
}
