package com.autowiring;

import com.cons.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {
    public static void main(String[] args) {
        Resource res = new ClassPathResource("autowireconfig.xml");
        BeanFactory factory = new XmlBeanFactory(res);

        Object o = factory.getBean("ct");
        Categories s = (Categories) o;

        // Shortcut for above two lines
        // Student s = (Student)factory.getBean("stu");

        s.bookDetails();

    }
}
