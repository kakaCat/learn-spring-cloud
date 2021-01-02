package learn.spring.enable.code;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName MyRegistrar
 * @Description MyRegistrar
 * @Author yunp , ResourceLoaderAware, EnvironmentAware
 * @Date 2020/12/15 10:55
 * @Version 1.0
 **/
public class MyRegistrar implements ImportBeanDefinitionRegistrar , ResourceLoaderAware, EnvironmentAware{

    private ResourceLoader resourceLoader;

    private Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }








    @Override
    public void registerBeanDefinitions(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
//        registerDefaultConfiguration(metadata, registry);
//        registerFeignClients(metadata, registry);
    }

    public void registerFeignClients(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {

        LinkedHashSet<BeanDefinition> candidateComponents = new LinkedHashSet<>();
        Map<String, Object> attrs = metadata.getAnnotationAttributes(EnableMyA.class.getName());
        AnnotationTypeFilter annotationTypeFilter = new AnnotationTypeFilter(MyA.class);
        final Class<?>[] clients = attrs == null ? null : (Class<?>[]) attrs.get("clients");
        if (clients == null || clients.length == 0) {
            ClassPathScanningCandidateComponentProvider scanner = getScanner();
            scanner.setResourceLoader(this.resourceLoader);
            scanner.addIncludeFilter(new AnnotationTypeFilter(MyA.class));
            Set<String> basePackages = getBasePackages(metadata);
            for (String basePackage : basePackages) {
                candidateComponents.addAll(scanner.findCandidateComponents(basePackage));
            }
        }
        else {
            for (Class<?> clazz : clients) {
                candidateComponents.add(new AnnotatedGenericBeanDefinition(clazz));
            }
        }

        for (BeanDefinition candidateComponent : candidateComponents) {
            if (candidateComponent instanceof AnnotatedBeanDefinition) {
                // verify annotated class is an interface
                AnnotatedBeanDefinition beanDefinition = (AnnotatedBeanDefinition) candidateComponent;
                AnnotationMetadata annotationMetadata = beanDefinition.getMetadata();
                Assert.isTrue(annotationMetadata.isInterface(), "@FeignClient can only be specified on an interface");

                Map<String, Object> attributes = annotationMetadata
                        .getAnnotationAttributes(MyA.class.getCanonicalName());

                String name = getClientName(attributes);
                registerClientConfiguration(registry, name, attributes.get("configuration"));

                registerFeignClient(registry, annotationMetadata, attributes);
            }
        }
    }

    private void registerFeignClient(BeanDefinitionRegistry registry, AnnotationMetadata annotationMetadata,
                                     Map<String, Object> attributes) {
        String className = annotationMetadata.getClassName();
        BeanDefinitionBuilder definition = BeanDefinitionBuilder.genericBeanDefinition(FeignClientFactoryBean.class);
        validate(attributes);
        definition.addPropertyValue("url", getUrl(attributes));
        definition.addPropertyValue("path", getPath(attributes));
        String name = getName(attributes);
        definition.addPropertyValue("name", name);
        String contextId = getContextId(attributes);
        definition.addPropertyValue("contextId", contextId);
        definition.addPropertyValue("type", className);
        definition.addPropertyValue("decode404", attributes.get("decode404"));
        definition.addPropertyValue("fallback", attributes.get("fallback"));
        definition.addPropertyValue("fallbackFactory", attributes.get("fallbackFactory"));
        definition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);

        String alias = contextId + "FeignClient";
        AbstractBeanDefinition beanDefinition = definition.getBeanDefinition();
        beanDefinition.setAttribute(FactoryBean.OBJECT_TYPE_ATTRIBUTE, className);

        // has a default, won't be null
        boolean primary = (Boolean) attributes.get("primary");

        beanDefinition.setPrimary(primary);

        String qualifier = getQualifier(attributes);
        if (StringUtils.hasText(qualifier)) {
            alias = qualifier;
        }

        BeanDefinitionHolder holder = new BeanDefinitionHolder(beanDefinition, className, new String[] { alias });
        BeanDefinitionReaderUtils.registerBeanDefinition(holder, registry);
    }

    private void registerDefaultConfiguration(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
        Map<String, Object> defaultAttrs = metadata.getAnnotationAttributes(MyRegistrar.class.getName(), true);

        if (defaultAttrs != null && defaultAttrs.containsKey("defaultConfiguration")) {
            String name;
            if (metadata.hasEnclosingClass()) {
                name = "default." + metadata.getEnclosingClassName();
            }
            else {
                name = "default." + metadata.getClassName();
            }
//            registerClientConfiguration(registry, name, defaultAttrs.get("defaultConfiguration"));
        }
    }



    private void registerClientConfiguration(BeanDefinitionRegistry registry, Object name, Object configuration) {
//        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(FeignClientSpecification.class);
//        builder.addConstructorArgValue(name);
//        builder.addConstructorArgValue(configuration);
//        registry.registerBeanDefinition(name + "." + FeignClientSpecification.class.getSimpleName(),
//                builder.getBeanDefinition());
    }

}
