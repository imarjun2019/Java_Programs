package spring.boot.aop.repository;

import org.springframework.stereotype.Repository;

@Repository
public class SecondDAO {
    public String retrieveSomething() {
        return "SecondDAO";
    }
}
