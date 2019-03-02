package learn.spring.BeanFactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {


    public static void main(String[] args) {
        String url = "context.xml";
        ClassPathXmlApplicationContext cpxa = new ClassPathXmlApplicationContext(url);
        Object school=  cpxa.getBean("factoryBeanPojo");
//        FactoryBeanPojo factoryBeanPojo= (FactoryBeanPojo) cpxa.getBean("&factoryBeanPojo");
//        System.out.println(school.getClass().getName());
//        System.out.println(factoryBeanPojo.getClass().getName());
    }


}
