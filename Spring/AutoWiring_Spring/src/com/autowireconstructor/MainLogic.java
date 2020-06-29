package com.autowireconstructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {
    public static void main(String[] args) {
        Resource res = new ClassPathResource("autowireconfigcons.xml");
        BeanFactory factory = new XmlBeanFactory(res);

        Categories x = (Categories)factory.getBean("ct");
        x.bookDetails();

    }
}
