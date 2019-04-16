package learn.spring.event;

import learn.spring.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class EventApplication {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

}
