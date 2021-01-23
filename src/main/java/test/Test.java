package test;

import com.erya.entity.Student;
import com.erya.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
//
//        Student student = new Student();
//        student.setId(1L);
//        student.setName("张三");
//        student.setAge(22);
//        System.out.println(student);
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student) context.getBean("student3");
        System.out.println(student);
        Student stu = (Student) context.getBean("stu");
        System.out.println(stu);
        User user = (User) context.getBean("user");
        User user1 = (User) context.getBean("user");

        System.out.println(user);
    }

}
