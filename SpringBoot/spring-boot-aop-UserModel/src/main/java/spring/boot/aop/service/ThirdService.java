package spring.boot.aop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.aop.annotation.TrackTime;
import spring.boot.aop.repository.ThirdDAO;

@Service
@Slf4j
public class ThirdService {

    @Autowired
    private ThirdDAO thirdDAO;

    @TrackTime
    public String calculateSomething() {
        String value = thirdDAO.retrieveSomething();
        log.info("In ThirdService: " + value);
        return value;
    }
}
