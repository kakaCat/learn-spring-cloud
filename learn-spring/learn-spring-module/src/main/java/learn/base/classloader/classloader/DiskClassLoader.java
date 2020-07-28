package learn.base.classloader.classloader;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @ClassName DiskClassLoader
 * @Description DiskClassLoader
 * @Author yunp
 * @Date 2020/7/7 10:47
 * @Version 1.0
 **/
public class DiskClassLoader extends URLClassLoader {

    public DiskClassLoader(URL path) throws MalformedURLException {
        super(new URL[]{path});
    }

    public DiskClassLoader(URL path, ClassLoader parent) throws MalformedURLException {
        super(new URL[]{path}, parent);
    }
}