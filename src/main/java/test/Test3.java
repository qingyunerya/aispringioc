package test;

import com.erya.entity.Student2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-p.xml");
        Student2 stu = (Student2) context.getBean("student");
        System.out.println(stu);

    }

}
