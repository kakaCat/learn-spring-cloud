package learn.spring.beanextend;

import learn.spring.portal.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStrap {



    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beancontext.xml");
        Student student = (Student)applicationContext.getBean("student");
        InitBean initBean = (InitBean)applicationContext.getBean("initBean");

        System.out.println(initBean.getBean());
        System.out.println(student.toString());
    }


}
