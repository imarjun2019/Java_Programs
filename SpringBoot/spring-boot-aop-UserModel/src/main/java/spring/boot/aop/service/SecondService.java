package spring.boot.aop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.aop.repository.SecondDAO;

@Service
@Slf4j
public class SecondService {

    @Autowired
    private SecondDAO secondDAO;

    public String calculateSomething() {
        String value = secondDAO.retrieveSomething();
        log.info("In SecondService: " + value);
        return value;
    }
}
