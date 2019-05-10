package learn.spring.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication()
public class EvnApplication {

    @Autowired
    private Environment environment;
    @RequestMapping("/")
    String index() {
        System.out.println(environment);
        return "xxxxxxxxxxxxx";
    }
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(EvnApplication.class);
//        springApplication.addListeners(new ShareniuApplicationStartedEventListener());
        springApplication.run(args);
    }

}
