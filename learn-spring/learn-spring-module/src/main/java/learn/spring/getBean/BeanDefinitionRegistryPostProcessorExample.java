package learn.spring.getBean;

import learn.spring.getBean.BeanDefinitionRegistryPostProcessor.MyConfigRegistry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName BeanDefinitionRegistryPostProcessorExample
 * @Description BeanDefinitionRegistryPostProcessorExample
 * @Author yunp
 * @Date 2020/7/28 17:24
 * @Version 1.0
 **/
public class BeanDefinitionRegistryPostProcessorExample {

    public static void main (String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfigRegistry.class);

        //MyBean bean = context.getBean(MyBean.class);
        //bean.doSomething();
        //bean.doOtherSomething();
        Message bean = context.getBean(Message.class);
        bean.print();
        Message myBean = (Message) context.getBean("myBeanDefinitionRegistry");
        myBean.print();

        Thread.sleep(1000L);
    }

}
