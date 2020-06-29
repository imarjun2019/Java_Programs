package com.th;

import org.springframework.aop.ThrowsAdvice;

public class AuthenticationAspect implements ThrowsAdvice {
    public void afterThrowing(Exception e)
    {
        System.out.println("Null Value");
    }
}
