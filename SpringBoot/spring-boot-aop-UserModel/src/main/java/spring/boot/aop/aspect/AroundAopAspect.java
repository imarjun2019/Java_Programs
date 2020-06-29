package spring.boot.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class AroundAopAspect {

    @Around("spring.boot.aop.aspect.CommonJoinPointConfig.aroundAnnotationTrackTime()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        proceedingJoinPoint.proceed();
        String result = (String) proceedingJoinPoint.proceed(new Object[]{});

        long timeTaken = System.currentTimeMillis() - startTime;
        log.info("Time Taken by {} is {}", proceedingJoinPoint, timeTaken);
        return result;
    }

}
