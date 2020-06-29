package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {


    @Before(value = "execution(* com.aop.service.EmployeeService.*(..)) && args(empId,name,address)")
    public void beforeAdvice(int empId, String name, String address) {
        System.out.println("\nBefore method creating an employee\n");
        System.out.printf("Creating Employee\nID:%d\nName:%s\nAddress:%s",empId,name,address);
    }
    @After(value = "execution(* com.aop.service.EmployeeService.*(..)) && args(empId,name,address)")
    public void afterAdvice(int empId, String name, String address) {
        System.out.println("\n\nAfter method for created Employee\n");
        System.out.printf("Successfully created the employee with\nID:%d\nName:%s\nAddress:%s",empId,name,address);
    }





}
