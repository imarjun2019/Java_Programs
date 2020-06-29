package com.mail;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

public class MailLogic {
    //private MailSender email;
    private JavaMailSender mail;
    public void setMail(JavaMailSender mail)
    {
        this.mail=mail;
    }

    public void sendMessage(String to, String subject, String msg) throws MessagingException {
        //SimpleMailMessage mailMessage = new SimpleMailMessage();
        MimeMessage mimeMessage = mail.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
        mimeMessageHelper.setTo(to);
        mimeMessageHelper.setSubject(subject);
        mimeMessageHelper.setText(msg);
        FileSystemResource file = new FileSystemResource("C:\\Users\\imarjun2014\\Desktop\\SpringHibeernateScreenchot\\SpringMailSend\\martin.jpg");
        mimeMessageHelper.addAttachment(file.getFilename(),file);
        mail.send(mimeMessage);



        System.out.println("Mail sent Successfully");

    }
}
