package learn.spring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {


    /**
     * 常规
     * @param args
     */
    public static void main(String[] args){
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
    }
    /**
     * 方式2
     */
//    public static void main(String[] args){
//        SpringApplication springApplication = new SpringApplication(Application.class);
//        springApplication.run(args);
//    }

//    public static void main(String[] args){
//        SpringApplication springApplication = new SpringApplication(Application.class);
//        springApplication.setApplicationContextClass(CustomizeApplicationContext.class);
//        springApplication.run(args);
//    }

//    public static void main(String[] args){
//
//        SpringApplication springApplication = new SpringApplication(Application.class);
//        springApplication.setWebEnvironment(false);
//        springApplication.run(args);
//    }

    @GetMapping("/hello")
    public String getHello(){
        return "hellow";
    }


}
