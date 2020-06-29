package spring.boot.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class BeforeAopAspect {

    @Before("spring.boot.aop.aspect.CommonJoinPointConfig.beforeDAOAccess()")
    public void before(JoinPoint joinPoint) {
        log.info(" Allowed execution for {}", joinPoint);
    }

}
