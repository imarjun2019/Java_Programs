package com.aop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)

public class MainLogic {
public static void main(String[] args) {

	ConfigurableApplicationContext cat = SpringApplication.run(MainLogic.class,args);
	Bofa bofa = cat.getBean(Bofa.class);
	bofa.withdraw();
	bofa.deposit();
	
}

}
