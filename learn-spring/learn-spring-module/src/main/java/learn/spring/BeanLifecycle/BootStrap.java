package learn.spring.BeanLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStrap {
    public static void main(String[] args) {
        System.out.println("现在开始初始化容器");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanLifecycle.xml");

        BeanLifecycle beanLifecycle = (BeanLifecycle)applicationContext.getBean(BeanLifecycle.class);

        System.out.println("现在开始关闭容器！");
        ((ClassPathXmlApplicationContext)applicationContext).registerShutdownHook();
    }
}
