package learn.spring.getBean;

import learn.spring.getBean.ImportSelector.PrintService;
import learn.spring.getBean.ImportSelectorExamplea.MessageImportSelectorConfiguration1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName ImportSelector
 * @Description ImportSelectorExample
 * @Author yunp
 * @Date 2020/7/29 11:30
 * @Version 1.0
 **/
public class ImportSelectorExample1 {


    public static void main(String[] args) {


        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                MessageImportSelectorConfiguration1.class);

        PrintService ps = (PrintService) applicationContext
                .getBean(PrintService.class);
        ps.print("ImportBeanDefinitionRegistrar demo");

    }

}
