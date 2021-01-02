package learn.spring.getBean.ImportSelectorExamplec;

import learn.spring.getBean.ImportSelectorExamplec.PrintServiceScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MessageImportSelectorConfiguration
 * @Description MessageImportSelectorConfiguration
 * @Author yunp
 * @Date 2020/7/29 11:26
 * @Version 1.0
 **/
@Configuration
//@Import(MessageImportSelector.class)
@PrintServiceScan("learn.spring.getBean.ImportSelector")
public class MessageImportSelectorConfiguration3 {
}
