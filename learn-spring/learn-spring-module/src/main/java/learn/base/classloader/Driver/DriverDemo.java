package learn.base.classloader.Driver;

import java.sql.*;
import java.sql.Driver;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @ClassName DriverDemo
 * @Description DriverDemo
 * @Author yunp
 * @Date 2020/7/7 17:28
 * @Version 1.0
 **/
public class DriverDemo implements Driver {

    @Override
    public Connection connect(String url, Properties info) throws SQLException {
        System.out.println("111");
        return null;
    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        return false;
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        return new DriverPropertyInfo[0];
    }

    @Override
    public int getMajorVersion() {
        return 0;
    }

    @Override
    public int getMinorVersion() {
        return 0;
    }

    @Override
    public boolean jdbcCompliant() {
        return false;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
