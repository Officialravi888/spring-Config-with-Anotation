package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainConfig {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student=context.getBean("first",Student.class);
        student.Study();
    }
}