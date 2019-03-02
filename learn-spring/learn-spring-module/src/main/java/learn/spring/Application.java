package learn.spring;


import learn.spring.learnapplicationcontextmodule.CustomizeApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {


    /**
     * 常规
     * @param args
     */
//    public static void main(String[] args){
//        SpringApplication.run(Application.class, args);
//    }
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

    public static void main(String[] args){

        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.setWebEnvironment(false);
        springApplication.run(args);
    }

    @GetMapping("/hello")
    public String getHello(){
        return "hellow";
    }


}
