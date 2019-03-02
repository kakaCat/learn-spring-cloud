package learn.spring.autowire;

import learn.spring.portal.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStrapAutowired {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        Student student = (Student)applicationContext.getBean("student");


    }



}
