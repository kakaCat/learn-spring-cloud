package learn.spring.getBean.ImportSelectorExamplec;

import learn.spring.getBean.ImportSelector.PrintService;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AssignableTypeFilter;
import org.springframework.core.type.filter.TypeFilter;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName MessageImportSelector
 * @Description MessageImportSelector
 * @Author yunp
 * @Date 2020/7/29 11:21
 * @Version 1.0
 **/
public class MessageImportSelector implements ImportSelector {


    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // TODO Auto-generated method stub
        //return new String[] {PrintServiceImpl.class.getName()};
        //不再写死了，用上元数据
        Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(PrintServiceScan.class.getName());
        String[] basePackages = (String[]) annotationAttributes.get("basePackages");
        if (basePackages == null || basePackages.length == 0) {//PrintServiceScan的basePackages默认为空数组
            String basePackage = null;
            try {
                basePackage = Class.forName(importingClassMetadata.getClassName()).getPackage().getName();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            basePackages = new String[] {basePackage};
        }
        ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(false);
        TypeFilter printServiceFilter = new AssignableTypeFilter(PrintService.class);
        scanner.addIncludeFilter(printServiceFilter);
        Set<String> classes = new HashSet<>();
        for (String basePackage : basePackages) {
            scanner.findCandidateComponents(basePackage).forEach(beanDefinition -> classes.add(beanDefinition.getBeanClassName()));
        }
        return classes.toArray(new String[classes.size()]);
    }

}
