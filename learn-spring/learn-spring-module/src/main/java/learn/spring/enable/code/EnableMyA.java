package learn.spring.enable.code;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @ClassName EnableMyA
 * @Description EnableMyA
 * @Author yunp
 * @Date 2020/12/15 10:56
 * @Version 1.0
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(MyRegistrar.class)
public @interface EnableMyA {
}
