package com.aop;

import com.aop.controller.EmployeeController;
import com.aop.model.Employee;
import com.aop.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass=true)
public class JavadashApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cat = SpringApplication.run(JavadashApplication.class, args);
		EmployeeController ec = cat.getBean(EmployeeController.class);
		Employee e = (Employee)ec.addEmployee(101,"Arjun","202 Janet Jackson Height, Chicago, 30687");
		String s = ec.removeEmployee(101);
		// System.out.println(s);
	}
}
