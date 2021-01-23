package com.erya.ioc;

import com.erya.entity.Student;

public class test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);

    }
}
