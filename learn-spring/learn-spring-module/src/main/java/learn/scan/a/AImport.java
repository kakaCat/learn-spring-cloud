package learn.scan.a;

import org.springframework.context.annotation.Bean;

/**
 * @ClassName AImport
 * @Description @Import
 * @Author yunp
 * @Date 2020/4/17 9:50
 * @Version 1.0
 **/
//@Import()
public class AImport {

    @Bean
    public Aname accountDao2(){
        return new Aname("Import");
    }

}
