package learn.scan.a;

import lombok.Data;

/**
 * @ClassName Aname
 * @Description getname
 * @Author yunp
 * @Date 2020/4/17 9:51
 * @Version 1.0
 **/
@Data
public class Aname {

    private String name;

    public Aname(String name){
        this.name = name;
    }

}
