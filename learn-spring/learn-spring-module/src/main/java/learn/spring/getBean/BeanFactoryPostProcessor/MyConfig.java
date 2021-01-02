package learn.spring.getBean.BeanFactoryPostProcessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyConfig
 * @Description MyConfig
 * @Author yunp
 * @Date 2020/7/28 17:19
 * @Version 1.0
 **/
@Configuration
public class MyConfig {
    @Bean
    MessageBeanFactoryPostProcessor messageConfigBean () {
        return new MessageBeanFactoryPostProcessor();
    }
}