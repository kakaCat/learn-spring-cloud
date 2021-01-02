package learn.spring.getBean;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @ClassName GenericBeanDefinitionExample
 * @Description GenericBeanDefinitionExample
 * @Author yunp
 * @Date 2020/7/28 17:07
 * @Version 1.0
 **/
public class GenericBeanDefinitionExample {



    public static void main (String[] args) {
        DefaultListableBeanFactory context =
                new DefaultListableBeanFactory();

        //在此构造bean定义
        GenericBeanDefinition gbd = new GenericBeanDefinition();
        gbd.setBeanClass(Message.class);

        //
        MutablePropertyValues mpv = new MutablePropertyValues();
        mpv.add("message", "this is a bean");

        gbd.setPropertyValues(mpv);

        //注册到环境上下文
        context.registerBeanDefinition("myBean", gbd);

        Message bean = context.getBean(Message.class);
        bean.print();
        Message myBean = (Message) context.getBean("myBean");
        myBean.print();
    }

}
