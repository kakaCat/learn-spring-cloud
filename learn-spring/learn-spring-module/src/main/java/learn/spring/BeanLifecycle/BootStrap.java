package learn.spring.BeanLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStrap {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanLifecycle.xml");

        BeanLifecycle beanLifecycle = (BeanLifecycle)applicationContext.getBean(BeanLifecycle.class);

        System.out.println(beanLifecycle.toString());
    }
}
