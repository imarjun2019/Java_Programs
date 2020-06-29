package spring.boot.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.boot.aop.service.FirstService;
import spring.boot.aop.service.SecondService;
import spring.boot.aop.service.ThirdService;

@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
public class ServiceAopSpringBootTest {

    @Autowired
    private FirstService firstService;

    @Autowired
    private SecondService secondService;

    @Autowired
    private ThirdService thirdService;

    @Test
    public void invokeAopStuff() {
        log.info("");
        log.info(firstService.calculateSomething());
        log.info("");
        log.info(secondService.calculateSomething());
        log.info("");
        log.info(thirdService.calculateSomething());
    }

}
