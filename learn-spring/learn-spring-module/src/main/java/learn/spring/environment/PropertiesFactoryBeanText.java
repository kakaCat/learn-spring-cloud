package learn.spring.environment;

import learn.spring.portal.Student;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Properties;

public class PropertiesFactoryBeanText {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("properties.xml");

        Environment environment = (Environment)applicationContext.getBean("environment");


        Properties properties = (Properties)applicationContext.getBean("configProperties");


        Properties properties1 = (Properties)applicationContext.getBean("configProperties1");


        System.out.println("---");
    }


}
