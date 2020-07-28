package learn.base.classloader;

import learn.base.classloader.serializable.FileDome;

import java.io.*;

/**
 * @ClassName SerializableDome
 * @Description TODO
 * @Author yunp
 * @Date 2020/7/4 15:51
 * @Version 1.0
 **/
public class SerializableDome {


    private static final String PREFIX = "/main/resources/META-INF/";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileDome fileDome = new FileDome();
        fileDome.setName("hello world");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(PREFIX+ "data.obj"));
        out.writeObject(fileDome);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(PREFIX+"data.obj"));
        FileDome serializable = (FileDome) in.readObject();
        in.close();

        System.out.println("Object say " + serializable.getName());





    }


}
