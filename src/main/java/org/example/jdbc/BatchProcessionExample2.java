package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessionExample2
{
    static String url = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
    static String username = "root";
    static String password = "ashwin1234";
    static Connection connection = null;
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            connection.setAutoCommit(false);
            Statement stmt = connection.createStatement();
            //stmt.addBatch("insert into voters(id, name, age) value (207,'muskan',20)");
            stmt.addBatch("delete from voters where name = 'muskan'");
            ////
            int[] insertCount = stmt.executeBatch();
            for(int count : insertCount)
            {
                System.out.println("count "+count);
            }
            ////
            connection.commit();

        } catch (Exception e)
        {
            try
            {
                connection.rollback();
            } catch (SQLException ex) {
                e.printStackTrace();
            }
            e.printStackTrace();
        }


    }
}
