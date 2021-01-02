package learn.spring.getBean;

import learn.spring.getBean.ImportSelector.PrintService;
import learn.spring.getBean.ImportSelectorExampleb.MessageImportBeanDefinitionRegistrarConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @ClassName ImportSelectorExample2
 * @Description ImportSelectorExample2
 * @Author yunp
 * @Date 2020/7/29 14:15
 * @Version 1.0
 **/
public class ImportSelectorExample2 {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                MessageImportBeanDefinitionRegistrarConfiguration.class);
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        System.out.println(Arrays.asList(beanNames));
        Message bean = applicationContext.getBean(Message.class);
        bean.print();

        PrintService ps = (PrintService) applicationContext
                .getBean(PrintService.class);
        ps.print("ImportBeanDefinitionRegistrar demo");
    }

}
