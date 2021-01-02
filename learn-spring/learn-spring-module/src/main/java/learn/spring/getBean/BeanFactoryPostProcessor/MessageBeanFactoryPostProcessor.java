package learn.spring.getBean.BeanFactoryPostProcessor;

import learn.spring.getBean.Message;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @ClassName MessageBeanFactoryPostProcessor
 * @Description MessageBeanFactoryPostProcessor
 * @Author yunp
 * @Date 2020/7/28 17:18
 * @Version 1.0
 **/
public class MessageBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(
            ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // TODO Auto-generated method stub
        GenericBeanDefinition gbd = new GenericBeanDefinition();
        gbd.setBeanClass(Message.class);

        MutablePropertyValues mpv = new MutablePropertyValues();
        mpv.add("message", "this is a BeanFactoryPostProcessor bean");
        gbd.setPropertyValues(mpv);

        ((DefaultListableBeanFactory) beanFactory).registerBeanDefinition(
                "myBean", gbd);
    }
}