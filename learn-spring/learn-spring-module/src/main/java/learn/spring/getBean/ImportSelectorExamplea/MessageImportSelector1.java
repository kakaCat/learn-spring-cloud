package learn.spring.getBean.ImportSelectorExamplea;

import learn.spring.getBean.ImportSelector.PrintServiceImpl;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName MessageImportSelector1
 * @Description MessageImportSelector1
 * @Author yunp
 * @Date 2020/7/29 11:29
 * @Version 1.0
 **/
public class MessageImportSelector1 implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // TODO Auto-generated method stub
        return new String[] {PrintServiceImpl.class.getName()};

    }
}
