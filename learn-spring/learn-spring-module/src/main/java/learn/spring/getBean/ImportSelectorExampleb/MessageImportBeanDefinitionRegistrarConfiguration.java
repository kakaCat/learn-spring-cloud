package learn.spring.getBean.ImportSelectorExampleb;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName MessageImportBeanDefinitionRegistrarConfiguration
 * @Description MessageImportBeanDefinitionRegistrarConfiguration
 * @Author yunp
 * @Date 2020/7/29 14:14
 * @Version 1.0
 **/
@Configuration
@Import(MessageImportBeanDefinitionRegistrar.class)
public class MessageImportBeanDefinitionRegistrarConfiguration {

}