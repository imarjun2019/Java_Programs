package spring.boot.aop.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ThirdDAO {
    public String retrieveSomething() {
        return "ThirdDAO";
    }
}
