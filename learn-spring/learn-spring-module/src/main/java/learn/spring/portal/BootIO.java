package learn.spring.portal;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BootIO {

    public static void main(String[] args) {
        //读取资源
        Resource resource = new ClassPathResource("context.xml");
        String filename = resource.getFilename();
        System.out.println(filename);

        //初始化容器
        new XmlBeanFactory(resource);
    }

}
