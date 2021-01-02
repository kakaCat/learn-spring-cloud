package learn.spring.enable.code;

import java.lang.annotation.*;

/**
 * @ClassName MyA
 * @Description 自定义
 * @Author yunp
 * @Date 2020/12/15 10:54
 * @Version 1.0
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyA {
}
