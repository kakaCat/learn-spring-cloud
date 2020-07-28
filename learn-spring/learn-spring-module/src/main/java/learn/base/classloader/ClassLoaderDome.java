package learn.base.classloader;

/**
 * @ClassName ClassLoaderDome
 * @Description 类加载器
 * @Author yunp
 * @Date 2020/6/15 10:14
 * @Version 1.0
 **/
public class ClassLoaderDome {

    public static void main(String[] args) throws ClassNotFoundException {


        ClassLoaderDome dome = new ClassLoaderDome();

        System.out.println("toString: "+ClassLoaderDome.class.toString());


        System.out.println("toGenericString: "+ClassLoaderDome.class.toGenericString());
        Class<?> aClass = Class.forName("learn.base.classloader.ClassLoaderDome");
        System.out.println("Class.forName: " + aClass);

        try {
            Object o = aClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        ClassLoader loader = ClassLoaderDome.class.getClassLoader();

        System.out.println(loader.toString());

        System.out.println(loader.getParent().toString());

        System.out.println(loader.getParent().getParent());


    }



}
