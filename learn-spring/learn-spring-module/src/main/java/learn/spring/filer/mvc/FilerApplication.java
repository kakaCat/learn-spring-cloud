package learn.spring.filer.mvc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FilerApplication {


    /**
     * 常规
     * @param args
     */
    public static void main(String[] args){
        SpringApplication.run(FilerApplication.class, args);
    }
    @GetMapping("/home")
    public String home(){
        System.out.println("home");
        return "myhome";
    }

}
