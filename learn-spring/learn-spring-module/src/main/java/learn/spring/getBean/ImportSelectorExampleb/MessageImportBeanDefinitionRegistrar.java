package learn.spring.getBean.ImportSelectorExampleb;

import learn.spring.getBean.ImportSelector.PrintServiceImpl;
import learn.spring.getBean.Message;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName MessageImportBeanDefinitionRegistrar
 * @Description MessageImportBeanDefinitionRegistrar
 * @Author yunp
 * @Date 2020/7/29 14:13
 * @Version 1.0
 **/
public class MessageImportBeanDefinitionRegistrar implements
        ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(
            AnnotationMetadata importingClassMetadata,
            BeanDefinitionRegistry registry) {
        // 只以演示为例，现实场景通过importingClassMetadata拿到动态数据
        GenericBeanDefinition gbd = new GenericBeanDefinition();
        gbd.setBeanClass(Message.class);

        MutablePropertyValues mpv = new MutablePropertyValues();
        mpv.add("message", "this is a ImportBeanDefinitionRegistrar bean");
        gbd.setPropertyValues(mpv);

        registry.registerBeanDefinition("myBean", gbd);

        GenericBeanDefinition printBeanDefinition = new GenericBeanDefinition();
        printBeanDefinition.setBeanClass(PrintServiceImpl.class);
        registry.registerBeanDefinition("printBean", printBeanDefinition);
    }
}