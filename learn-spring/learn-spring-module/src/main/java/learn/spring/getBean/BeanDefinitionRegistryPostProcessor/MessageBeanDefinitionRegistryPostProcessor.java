package learn.spring.getBean.BeanDefinitionRegistryPostProcessor;

import learn.spring.getBean.Message;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @ClassName MessageBeanDefinitionRegistryPostProcessor
 * @Description MessageBeanDefinitionRegistryPostProcessor
 * @Author yunp
 * @Date 2020/7/28 17:22
 * @Version 1.0
 **/
public class MessageBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanFactory(
            ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // TODO Auto-generated method stub

    }

    @Override
    public void postProcessBeanDefinitionRegistry(
            BeanDefinitionRegistry registry) throws BeansException {
        // TODO Auto-generated method stub
        GenericBeanDefinition gbd = new GenericBeanDefinition();
        gbd.setBeanClass(Message.class);

        MutablePropertyValues mpv = new MutablePropertyValues();
        mpv.add("message", "this is a BeanDefinitionRegistryPostProcessor bean");
        gbd.setPropertyValues(mpv);

        registry.registerBeanDefinition(
                "myBean", gbd);
    }
}
