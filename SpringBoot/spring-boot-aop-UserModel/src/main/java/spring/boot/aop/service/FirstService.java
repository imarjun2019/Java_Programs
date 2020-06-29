package spring.boot.aop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.aop.repository.FirstDAO;

@Service
@Slf4j
public class FirstService {
    
    @Autowired
    private FirstDAO firstDAO;

    public String calculateSomething() {
        String value = firstDAO.retrieveSomething();
        log.info("In FirstService: " + value);
        return value;
    }
}
