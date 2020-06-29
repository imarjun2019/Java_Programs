package spring.boot.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut(value = "execution(* spring.boot.aop.service.*.*(..))")
    public void afterExecutionOfServiceMethods() {
    }

    @Pointcut(value = "execution(* spring.boot.aop.service.*.*(..))")
    public void afterExecutionOfServiceMethodsReturningResult() {
    }

    @Pointcut("@annotation(spring.boot.aop.annotation.TrackTime)")
    public void aroundAnnotationTrackTime() {
    }

    @Pointcut("execution(* spring.boot.aop.repository.*.*(..))")
    public void beforeDAOAccess() {
    }

}
