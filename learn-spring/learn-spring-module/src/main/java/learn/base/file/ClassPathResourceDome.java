package learn.base.file;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName ClassPathResourceDome
 * @Description spring 提供加载文件
 * @Author yunp
 * @Date 2020/7/4 16:40
 * @Version 1.0
 **/
public class ClassPathResourceDome {


    public static void main(String[] args) throws IOException {

        ClassPathResource classPathResource = new ClassPathResource("excleTemplate/test.xlsx");

        InputStream inputStream =classPathResource.getInputStream();




    }

}
