package learn.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationSpring {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        AnnUser annUser = (AnnUser)ctx.getBean("annUser");
        System.out.println(annUser.getHello());

        ctx.close();
    }

}
