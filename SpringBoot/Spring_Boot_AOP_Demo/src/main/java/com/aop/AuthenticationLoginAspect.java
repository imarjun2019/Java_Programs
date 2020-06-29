package com.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationLoginAspect implements MethodInterceptor {
    @Override
    @Around(value = "execution(*com.aop.MyAccount)")
    public Object invoke(MethodInvocation m) throws Throwable {
        System.out.println("Authentication Done!");
        Object o = m.proceed();
        System.out.println("Logging Information stored");
        return o;
    }
}
