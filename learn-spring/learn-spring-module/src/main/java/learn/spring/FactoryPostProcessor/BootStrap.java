package learn.spring.FactoryPostProcessor;

import learn.spring.portal.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStrap {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("postProcessor.xml");
        BeanFactoryPostProcessorTest beanFactoryPostProcessorTest = (BeanFactoryPostProcessorTest)applicationContext.getBean("beanFactoryPostProcessorTest");
        System.out.println(beanFactoryPostProcessorTest.toString());
    }
}
