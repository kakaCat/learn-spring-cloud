package learn.base.classloader;

import learn.base.classloader.classloader.DiskClassLoader;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;

/**
 * @ClassName DiskClassLoaderDome
 * @Description DiskClassLoaderDome
 * @Author yunp
 * @Date 2020/7/7 10:48
 * @Version 1.0
 **/
public class DiskClassLoaderDome {

    public static void main(String[] args) throws Exception {
//        URL path = new File("/data/classloader").toURI().toURL();
//
//        System.out.println(path.toString());
//
//        DiskClassLoader diskClassLoaderA = new DiskClassLoader(path);
//        Class<?> clazzA = diskClassLoaderA.loadClass("BeLoadedClass");
//        Method sayA = clazzA.getMethod("say");
//        Object instanceA = clazzA.newInstance();
//        sayA.invoke(instanceA);
//        System.out.println(diskClassLoaderA);
//        System.out.println("clazzA@" + clazzA.hashCode());
//
//        System.out.println("====");
//
//        DiskClassLoader diskClassLoaderB = new DiskClassLoader(path, diskClassLoaderA);
//        Class<?> clazzB = diskClassLoaderB.loadClass("BeLoadedClass");
//        Method sayB = clazzB.getMethod("say");
//        Object instanceB = clazzA.newInstance();
//        sayB.invoke(instanceB);
//        System.out.println(diskClassLoaderB);
//        System.out.println("clazzB@" + clazzB.hashCode());
//
//        System.out.println("====");
//
//        DiskClassLoader diskClassLoaderC = new DiskClassLoader(path);
//        Class<?> clazzC = diskClassLoaderC.loadClass("BeLoadedClass");
//        Method sayC = clazzC.getMethod("say");
//        Object instanceC = clazzC.newInstance();
//        sayC.invoke(instanceC);
//        System.out.println(diskClassLoaderC);
//        System.out.println("clazzC@" + clazzC.hashCode());
//
//        System.out.println("====");
//
//        System.out.println("clazzA == clazzB " + (clazzA == clazzB));
//        System.out.println("clazzC == clazzB " + (clazzC == clazzB)); URL path = new File("/data/classloader").toURI().toURL();
//
//        System.out.println(path.toString());
//
//        DiskClassLoader diskClassLoaderA = new DiskClassLoader(path);
//        Class<?> clazzA = diskClassLoaderA.loadClass("BeLoadedClass");
//        Method sayA = clazzA.getMethod("say");
//        Object instanceA = clazzA.newInstance();
//        sayA.invoke(instanceA);
//        System.out.println(diskClassLoaderA);
//        System.out.println("clazzA@" + clazzA.hashCode());
//
//        System.out.println("====");
//
//        DiskClassLoader diskClassLoaderB = new DiskClassLoader(path, diskClassLoaderA);
//        Class<?> clazzB = diskClassLoaderB.loadClass("BeLoadedClass");
//        Method sayB = clazzB.getMethod("say");
//        Object instanceB = clazzA.newInstance();
//        sayB.invoke(instanceB);
//        System.out.println(diskClassLoaderB);
//        System.out.println("clazzB@" + clazzB.hashCode());
//
//        System.out.println("====");
//
//        DiskClassLoader diskClassLoaderC = new DiskClassLoader(path);
//        Class<?> clazzC = diskClassLoaderC.loadClass("BeLoadedClass");
//        Method sayC = clazzC.getMethod("say");
//        Object instanceC = clazzC.newInstance();
//        sayC.invoke(instanceC);
//        System.out.println(diskClassLoaderC);
//        System.out.println("clazzC@" + clazzC.hashCode());
//
//        System.out.println("====");
//
//        System.out.println("clazzA == clazzB " + (clazzA == clazzB));
//        System.out.println("clazzC == clazzB " + (clazzC == clazzB));
    }

}
