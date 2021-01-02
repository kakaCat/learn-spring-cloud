package learn.base.classloader;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @ClassName DriverDome
 * @Description DriverStartDome
 * @Author yunp
 * @Date 2020/7/6 19:35
 * @Version 1.0
 **/
public class DriverStartDome {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {


        Class.forName("com.mysql.jdbc.Driver");


        try {
            Connection connection = DriverManager.getConnection("");
        } catch (SQLException e) {
            e.printStackTrace();
        }




    }



}
