package com.tightcpl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {
    public static void main(String[] args) {

        Resource res = new ClassPathResource("spconfig1.xml");
        BeanFactory factory = new XmlBeanFactory(res);

        Car car = (Car)factory.getBean("cc");
        car.CarDetails();

    }
}
