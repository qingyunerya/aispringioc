package test;

import com.erya.entity.Car;
import com.erya.entity.Student2;
import com.erya.factory.InstanceCarFactory;
import com.erya.factory.StaticCarFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {

//        Car car = StaticCarFactory.getCar(1L);
//        System.out.println(car);
       ApplicationContext context = new ClassPathXmlApplicationContext("spring-factory.xml");
        Car car = (Car) context.getBean("car2");
        System.out.println(car);

//        InstanceCarFactory instanceCarFactory = new InstanceCarFactory();
//        Car car = instanceCarFactory.getCar(1L);
//        System.out.println(car);



    }

}
