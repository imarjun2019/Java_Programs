package com.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AuthenticationLoginAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation m) throws Throwable {
        System.out.println("Authentication Done!");
        Object o = m.proceed();
        System.out.println("Logging Information stored");
        return o;
    }
}
