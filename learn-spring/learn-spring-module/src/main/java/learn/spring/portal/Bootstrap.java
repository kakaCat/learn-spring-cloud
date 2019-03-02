package learn.spring.portal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        Student student = (Student)applicationContext.getBean("student");
        System.out.println(student.toString());
    }


}
