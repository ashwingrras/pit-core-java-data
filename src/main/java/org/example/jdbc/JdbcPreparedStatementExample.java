package org.example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcPreparedStatementExample
{
    public static void main(String[] args)
    {
        try
        {
            Connection connection = new DbHelper().getSqlConnection();
            if(connection != null)
            {
                /*
                String queryInsert = "insert into student (name, mobileno, emailid, age) values (?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(queryInsert);
                preparedStatement.setString(1, "ashwin bajaj");
                preparedStatement.setString(2, "9799605400");
                preparedStatement.setString(3, "ashwin@grrassolutions.in");
                preparedStatement.setString(4, "32");
                preparedStatement.executeUpdate();
                */
                String querySelect = "select * from student where name = ?";
                PreparedStatement preparedStatementSelect = connection.prepareStatement(querySelect);
                preparedStatementSelect.setString(1,"ashwin bajaj or 1 = 1");
                ResultSet resultSet = preparedStatementSelect.executeQuery();
                while(resultSet.next())
                {
                    System.out.println(resultSet.getString("name"));
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
