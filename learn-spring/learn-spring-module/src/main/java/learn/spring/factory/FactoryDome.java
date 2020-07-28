package learn.spring.factory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @ClassName FactoryDome
 * @Description TODO
 * @Author yunp
 * @Date 2020/6/12 16:21
 * @Version 1.0
 **/
public class FactoryDome {

    public static void main(String[] args) {

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        Object bean = factory.getBean("");

    }


}
