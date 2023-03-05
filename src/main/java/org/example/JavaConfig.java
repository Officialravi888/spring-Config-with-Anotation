package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
//@ComponentScan(basePackages = "org.example")
public class JavaConfig {
    @Bean(name = "first")
    public Student getStudent(){
        Student student=new Student(getSamosa());
        return student;
    }
    @Bean
    public Samosa getSamosa(){
        return new Samosa();
    }
}
