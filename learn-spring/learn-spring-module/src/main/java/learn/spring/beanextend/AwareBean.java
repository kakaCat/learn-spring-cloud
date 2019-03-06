package learn.spring.beanextend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AwareBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    private String                     beanName;

    private ApplicationContext        applicationContext;

    private BeanFactory                beanFactory;


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Enter AwareBean.setBeanName(), beanName = " + beanName + "\n");
        this.beanName = beanName;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Enter AwareBean.setBeanFactory(), beanfactory = " + beanFactory + "\n");
        this.beanFactory = beanFactory;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Enter AwareBean.setApplicationContext(), applicationContext = " + applicationContext + "\n");
        this.applicationContext = applicationContext;
    }
}
