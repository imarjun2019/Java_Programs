package com.list;

import com.cons.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {
    public static void main(String[] args) {
        Resource res = new ClassPathResource("listconfig.xml");
        BeanFactory factory = new XmlBeanFactory(res);

        Object o = factory.getBean("ques");

        Questions s = (Questions) o;

        // Shortcut for above two lines
        // Student s = (Student)factory.getBean("stu");

        s.answerInfo();

    }
}
