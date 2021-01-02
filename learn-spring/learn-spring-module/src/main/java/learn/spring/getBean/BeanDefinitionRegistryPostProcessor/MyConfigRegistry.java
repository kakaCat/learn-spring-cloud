package learn.spring.getBean.BeanDefinitionRegistryPostProcessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyConfig
 * @Description MyConfig
 * @Author yunp
 * @Date 2020/7/28 17:23
 * @Version 1.0
 **/
@Configuration
public class MyConfigRegistry {
//    @Bean
//    ConfigBeanFactoryPostProcessor myConfigBean () {
//        return new ConfigBeanFactoryPostProcessor();
//    }

  /*@Bean
  MessageBeanFactoryPostProcessor messageBeanFactoryPostProcessor () {
      return new MessageBeanFactoryPostProcessor();
  }*/

    @Bean
    MessageBeanDefinitionRegistryPostProcessor messageBeanDefinitionRegistryPostProcessor () {
        return new MessageBeanDefinitionRegistryPostProcessor();
    }
}