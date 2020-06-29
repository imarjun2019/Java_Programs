package com.esgyn.aop_demo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Slf4j
public class UserLogAspect {


    @Pointcut("execution(* com.esgyn.aop_demo.service..*(..))")
    public void log() {
        log.info("begin");
    }

    @Before("log()")
    public void doBefore() {
//        log.info(Arrays.asList(joinPoint.getArgs()).toString());
        log.info("Do before....");
    }

    @After("log()")
    public void doAfter(JoinPoint joinPoint) {
        log.info("Do after....");
    }

    @AfterReturning("log()")
    public void doAfterReturning(JoinPoint joinPoint) {
        log.info("Do afterReturning....");
    }

    @Around("log()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Do around111111....");
        Object obj;
        try {
            obj = joinPoint.proceed();
        } catch (Exception e) {
            throw e;
        }finally {
            log.info("Do around22222222....");
        }

        return obj;

    }

    @AfterThrowing("log()")
    public void doAfterThrowing(JoinPoint joinPoint) {
        log.info("Do after throwing...");
    }
}
