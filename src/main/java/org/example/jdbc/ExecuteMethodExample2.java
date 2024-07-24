package org.example.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteMethodExample2
{
    public static void main(String[] args)
    {
        try
        {
            Connection connection = new DbHelper().getSqlConnection();
            if(connection != null)
            {
                Statement statement = connection.createStatement();
                String param = "'aman'"; //"'aman' or 1 = 1";
                String query = "select * from student where name = "+param;
                boolean executeResult = statement.execute(query);
                System.out.println("executeResult: "+executeResult);
                if(executeResult)
                {
                    // select:   ResultSet
                    ResultSet resultSet = statement.getResultSet();
                    while(resultSet.next())
                    {
                        System.out.println(resultSet.getString("name"));
                    }
                }
                else
                {
                    // insert, update, delete  : int count
                    int count = statement.getUpdateCount();
                    System.out.println("count: "+count);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
