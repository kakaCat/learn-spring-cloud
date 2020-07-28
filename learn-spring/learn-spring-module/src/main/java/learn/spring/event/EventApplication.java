package learn.spring.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventApplication {

    public static void main(String[] args){
        SpringApplication springApplication = new SpringApplication(EventApplication.class);
//        springApplication.addListeners((ApplicationListener<?>) new RegisterRandomEmailListener());
        springApplication.run(args);
    }

}
