package test;

import com.erya.entity.Car;
import com.erya.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-autowire.xml");
        Person person = (Person) context.getBean("person");
        Person person1 = (Person) context.getBean("person2");
//        System.out.println(person1);
        System.out.println(person);
    }

}
