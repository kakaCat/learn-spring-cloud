package learn.base.file;

import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @ClassName ResourceUtilsDome
 * @Description spring 提供加载文件
 * @Author yunp
 * @Date 2020/7/4 16:17
 * @Version 1.0
 **/
public class ResourceUtilsDome {

    public static void main(String[] args) throws FileNotFoundException {
        File file = ResourceUtils.getFile("classpath:META-INF/data.obj");

        System.out.println(file);

    }


}
