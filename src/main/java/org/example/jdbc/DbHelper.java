package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbHelper
{
    String url = DataBaseConstant.URL;
    String user = DataBaseConstant.USER;
    String password = DataBaseConstant.PASSWORD;

    public Connection getSqlConnection()
    {
        Connection connection;
        try
        {
            connection = DriverManager.getConnection(url, user, password);
        }
        catch (Exception e)
        {
            connection = null;
            e.printStackTrace();
        }
        return connection;
    }

}
