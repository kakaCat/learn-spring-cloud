package learn.spring.BeanLifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycle implements InitializingBean, DisposableBean
        , BeanFactoryAware, BeanNameAware, ApplicationContextAware {


    private String name;
    private String sex;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("》》》调用BeanLifecycle对象"+this.getName()+"属性set方法，设值为:"+name);
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        System.out.println("》》》调用BeanLifecycle对象"+this.getSex()+"属性set方法，设值为:"+sex);
        this.sex = sex;
    }
    /**
     * 依次开始调用初始化回调方法
     */
    @PostConstruct
    public void initPostConstruct(){
        System.out.println("》》》注解初始化方法被调用");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("》》》BeanLifecycle调用了InitailizingBean的afterPorpertiesSet方法了.....");
    }

    public void init (){
        System.out.println("》》》init方法被调用");
    }

    /**
     * 依次开始调用销毁回调方法
     */

    @PreDestroy
    public void preDestroy(){
        System.out.println("》》》注解销毁方法被调用");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("》》》BeanLifecycle从Spring IoC容器中移除了.......");
    }
    public void  close() {
        System.out.println("》》》close方法被调用");
    }

    @Override
    public void setApplicationContext(ApplicationContext paramApplicationContext)
            throws BeansException {
        System.out.print("》》》调用ApplicationContextAware接口setApplicationContext方法:");
        System.out.println(paramApplicationContext);

    }



    @Override
    public void setBeanName(String paramString) {
        System.out.println("》》》调用BeanNameAware接口setBenaName方法: "+paramString);

    }

    @Override
    public void setBeanFactory(BeanFactory paramBeanFactory)
            throws BeansException {

        System.out.print("》》》调用BeanFactoryAware接口setBeanFactory方法:");
        System.out.println(paramBeanFactory);

    }



    @Override
    public String toString() {
        return "BeanLifecycle [name=" + name + ", sex=" + sex + "]";
    }


}
