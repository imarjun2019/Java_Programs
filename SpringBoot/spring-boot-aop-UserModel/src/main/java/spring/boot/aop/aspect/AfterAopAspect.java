package spring.boot.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class AfterAopAspect {

    @AfterReturning(value = "spring.boot.aop.aspect.CommonJoinPointConfig.afterExecutionOfServiceMethodsReturningResult()",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        log.info("{} returned with value {}", joinPoint, result);
    }

    @After(value = "spring.boot.aop.aspect.CommonJoinPointConfig.afterExecutionOfServiceMethods()")
    public void after(JoinPoint joinPoint) {
        log.info("after execution of {}", joinPoint);
    }

}