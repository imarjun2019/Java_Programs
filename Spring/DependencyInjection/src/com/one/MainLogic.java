package com.one;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {
    public static void main(String[] args) {

        Resource res = new ClassPathResource("springconfig.xml");
        BeanFactory factory = new XmlBeanFactory(res);

        Resource res1 = new ClassPathResource("springconfig2.xml");
        BeanFactory factory1 = new XmlBeanFactory(res1,factory);


        Object o = factory1.getBean("travelobj");
        Journey t = (Journey) o;
        t.startJourney();

    }
}
