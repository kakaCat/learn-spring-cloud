package learn.spring.getBean;

import learn.spring.getBean.ImportSelector.PrintService;
import learn.spring.getBean.ImportSelectorExamplec.MessageImportSelectorConfiguration3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName ImportSelectorExample3
 * @Description ImportSelectorExample3
 * @Author yunp
 * @Date 2020/7/29 14:20
 * @Version 1.0
 **/
public class ImportSelectorExample3 {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MessageImportSelectorConfiguration3.class);
        PrintService ps = (PrintService) applicationContext.getBean(PrintService.class);
        ps.print("组合式 ImportSelector demo");
    }





}
