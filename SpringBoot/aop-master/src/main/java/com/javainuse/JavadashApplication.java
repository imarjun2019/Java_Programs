package com.javainuse;

import com.javainuse.controller.EmployeeController;
import com.javainuse.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class JavadashApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext cat = SpringApplication.run(JavadashApplication.class, args);
		Employee emp = cat.getBean(Employee.class);
		emp.setEmpId("101");
		emp.setName("Arjun");

		System.out.printf("%s and %s",emp.getEmpId(),emp.getName());

		
	}
}
