package learn.spring.getBean.ImportSelectorExamplea;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName MessageImportSelectorConfiguration1
 * @Description MessageImportSelectorConfiguration1
 * @Author yunp
 * @Date 2020/7/29 11:45
 * @Version 1.0
 **/
@Configuration
@Import(MessageImportSelector1.class)
public class MessageImportSelectorConfiguration1 {
}
