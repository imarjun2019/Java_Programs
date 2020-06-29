package com.mail;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import javax.mail.MessagingException;

public class MainLogic {
    public static void main(String[] args) {

        Resource res = new ClassPathResource("spconfig.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        MailLogic user = (MailLogic)factory.getBean("id2");
        try {
            user.sendMessage("imarjun2016@gmail.com","Aston Martin","Aston Martin Vanquish, 2020 Model, Teal Color");
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}
