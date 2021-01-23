package test;

import com.erya.entity.Student;
import com.erya.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dependsOn.xml");

    }

}
