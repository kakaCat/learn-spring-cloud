package learn.spring.bean.dome;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

/**
 * @ClassName BeanDome
 * @Description BeanDome
 * @Author yunp
 * @Date 2020/7/6 14:31
 * @Version 1.0
 **/

public class BeanInitDome implements InitializingBean {


    private String name;

    private String msg;


    @Override
    public void afterPropertiesSet() throws Exception {
        this.name = "初始化";
        this.msg = "开始";

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
