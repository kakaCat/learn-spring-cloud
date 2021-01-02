package learn.spring.getBean.ImportSelectorExamplec;



import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @ClassName EnablePrintService
 * @Description EnablePrintService
 * @Author yunp
 * @Date 2020/7/29 11:24
 * @Version 1.0
 **/


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(MessageImportSelectorConfiguration.class)
public @interface EnablePrintService {
}
