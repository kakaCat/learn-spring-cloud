package learn.spring.getBean;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @ClassName BeanDefinitionBuilderExample
 * @Description BeanDefinitionBuilderExample
 * 通过 BeanDefinitionBuilder 创建
 *
 *
 * @Author yunp
 * @Date 2020/7/28 17:17
 * @Version 1.0
 **/
public class BeanDefinitionBuilderExample {

    public static void main (String[] args) {
        DefaultListableBeanFactory context =
                new DefaultListableBeanFactory();

        //用到了构建者模式
        BeanDefinitionBuilder b =
                BeanDefinitionBuilder.rootBeanDefinition(Message.class)
                        .addPropertyValue("message", "this is a bean");

        context.registerBeanDefinition("myBean", b.getBeanDefinition());

        Message bean = context.getBean(Message.class);
        bean.print();
        Message myBean = (Message) context.getBean("myBean");
        myBean.print();
    }



}
