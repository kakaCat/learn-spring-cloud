package learn.spring;


import learn.spring.beanextend.factorybean.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath*:beancontext.xml",
})
public class BaseTest {

    @Resource
    private Animal animal;

    @Test
    public void aa() {
        animal.move();
    }

}
