package learn.spring.getBean;

import learn.spring.getBean.BeanFactoryPostProcessor.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName BeanFactoryPostProcessorExample
 * @Description BeanFactoryPostProcessorExample
 * @Author yunp
 * @Date 2020/7/28 17:20
 * @Version 1.0
 **/
public class BeanFactoryPostProcessorExample {


    public static void main (String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        //MyBean bean = context.getBean(MyBean.class);
        //bean.doSomething();
        //bean.doOtherSomething();
        Message bean = context.getBean(Message.class);
        bean.print();
        Message myBean = (Message) context.getBean("myBean");
        myBean.print();
    }
}