package org.example.jdbc;

import java.sql.*;

public class CallableStatementExample2
{
    static String url = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
    static String username = "root";
    static String password = "ashwin1234";

    static String procedureQuery = "{call UpdateVoterName(?, ?)}";
    public static void main(String[] args)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            CallableStatement callableStatement = connection.prepareCall(procedureQuery);
            callableStatement.setInt(1,101);
            callableStatement.setString(2,"harshit");

            callableStatement.execute();

            System.out.println("execute success");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from voters");
            while(resultSet.next())
            {
                System.out.println(resultSet.getString("name"));
            }
            System.out.println("now using prepared statement");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from voters where name = ?");
            preparedStatement.setString(1,"harshit");
            ResultSet resultSet1 = preparedStatement.executeQuery();
            while(resultSet1.next())
            {
                System.out.println(resultSet1.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
