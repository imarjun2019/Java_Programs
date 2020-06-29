package spring.boot.aop.repository;

import org.springframework.stereotype.Repository;

@Repository
public class FirstDAO {
    public String retrieveSomething() {
        return "FirstDAO";
    }
}
