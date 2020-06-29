package com.sph;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spconfig3.xml");
        StudentDao x = (StudentDao)ac.getBean("student");
        Student s = x.getDetails(102);

        System.out.println(s.getId() + " " + s.getName() + " " + s.getMarks());
//        s.setId(103);
//        s.setName("Ronny");
//        s.setMarks(1234);
//        x.saveStudentDetails(s);
        //x.deleteStudent(s);


    }
}
