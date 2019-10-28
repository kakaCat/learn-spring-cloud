package learn.base.loadbalance;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.stream.Stream;

public class InetAddressDome {

    public static void main(String[] args) throws UnknownHostException {
        Stream.of(InetAddress.getAllByName("www.taobao.com")).forEach(System.out::println);
    }

    public void random (){


        Random random = new Random();
        int size =2;
//        random.
        int i = random.nextInt(size);


    }


}
