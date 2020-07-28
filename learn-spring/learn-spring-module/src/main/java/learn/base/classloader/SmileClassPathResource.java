package learn.base.classloader;

import org.springframework.util.ClassUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @ClassName SmileClassPathResource
 * @Description SmileClassPathResource
 * @Author yunp
 * @Date 2020/7/7 20:49
 * @Version 1.0
 **/
public class SmileClassPathResource {

    private final String path;
    private ClassLoader classLoader;

    public SmileClassPathResource(String name) {
        this(name, getDefaultClassLoader());
    }

    public SmileClassPathResource(String name, ClassLoader classLoader) {
        this.path = name;
        this.classLoader = classLoader;
    }

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;

        try {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable var3) {
            ;
        }

        if(cl == null) {
            cl = ClassUtils.class.getClassLoader();
            if(cl == null) {
                try {
                    cl = ClassLoader.getSystemClassLoader();
                } catch (Throwable var2) {
                    ;
                }
            }
        }

        return cl;
    }

    public InputStream getInputStream() {
        InputStream is;
        if (this.classLoader != null) {
            is = this.classLoader.getResourceAsStream(this.path);
        } else {//当还是加载不到,调用上层加载器
            is = ClassLoader.getSystemResourceAsStream(this.path);
        }

        if (is == null) {
            throw new RuntimeException(path + " cannot be opened because it does not exist");
        } else {
            return is;
        }
    }


    public String getResourceStreamAsString() {
        InputStream is = getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SmileClassPathResource classPathResource = new SmileClassPathResource("logback.xml");
        System.out.println(classPathResource.getResourceStreamAsString());
    }

}
