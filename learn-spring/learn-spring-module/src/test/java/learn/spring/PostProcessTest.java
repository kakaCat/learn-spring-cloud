package learn.spring;

import learn.spring.beanextend.beanpostprocessor.CommonBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath*:PostProcess.xml",
})
public class PostProcessTest {

    @Autowired
    @Qualifier("common0")
    private CommonBean common0;

    @Autowired
    @Qualifier("common1")
    private CommonBean common1;

    @Test
    public void aa() {
        common0.initMethod();
        common1.initMethod();
    }


}
