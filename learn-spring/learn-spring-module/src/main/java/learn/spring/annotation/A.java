package learn.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName A
 * @Description TODO
 * @Author yunp
 * @Date 2020/6/13 11:09
 * @Version 1.0
 **/
@Service
public class A {

    @Autowired
    private B b;

    private String name;



}
