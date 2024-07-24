package org.example.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DatabaseMetaDataExample
{
    public static void main(String args[]){

        String url = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "ashwin1234";
        Connection connection = null;
        try{

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            ////
            System.out.println("Driver Name: "+databaseMetaData.getDriverName());
            System.out.println("UserName: "+databaseMetaData.getUserName());
            System.out.println("Database Product Name: "+databaseMetaData.getDatabaseProductName());
            System.out.println("Database Product Version: "+databaseMetaData.getDatabaseProductVersion());

            connection.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
