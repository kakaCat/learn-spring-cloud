package com.learn.springcloudlearn1.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by JAVA on 2018/11/7.
 *
 */
public class SpringCloudLearn1Application {



    //
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //直接注册  方法1
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationListener.class);

        //添加事件  方法2
        context.addApplicationListener(new MyApplicationListener());

        //注册ConfigApplication  方法3
        context.register(MyApplicationListener.class);

        //启动上下文
        context.refresh();

        context.publishEvent(new MyApplicationEvent("hello"));
    }


    @Component
    private static class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {
        @Override
        public void onApplicationEvent(MyApplicationEvent event) {

            System.out.printf("MyApplicationListener receives event source : %s \n", event.getSource());

        }
    }

    private static class MyApplicationEvent extends ApplicationEvent {

        public MyApplicationEvent(Object source){
            super(source);
        }
    }



    
}
