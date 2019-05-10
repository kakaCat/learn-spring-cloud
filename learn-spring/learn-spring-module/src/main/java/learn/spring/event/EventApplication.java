package learn.spring.event;

import learn.spring.Application;
import learn.spring.event.event.random.listener.RegisterRandomEmailListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class EventApplication {

    public static void main(String[] args){
        SpringApplication springApplication = new SpringApplication(EventApplication.class);
//        springApplication.addListeners((ApplicationListener<?>) new RegisterRandomEmailListener());
        springApplication.run(args);
    }

}
