package com.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.Map;
import java.util.Set;

public class MainLogic {

    public static void main(String[] args) {
        Resource re = new ClassPathResource("mapspconfig.xml");

        BeanFactory factory = new XmlBeanFactory(re);
        Object o = factory.getBean("course");

       Course c = (Course)o;

        //System.out.println(c.getStudentCourse());

        c.details();
        
    }
}
