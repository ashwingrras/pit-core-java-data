package org.example.jdbc;

import java.sql.*;
import java.util.Date;

/*
    1. ResultSet (forward only, scrollable, read only)
    2. Statement : executeQuery, executeUpdate
    3. PreparedStatement
    4. CallableStatement
    5. Batch (multiple queries same time)
    6. RowSet
 */
/*

        1. inventory management: product, stock, supplier
        2. billing management: customer, items, bill

 */

public class MySqlExampleWithDateColumn
{
    private static final String URL = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
    private static final String USER = "root";
    private static final String PASSWORD = "ashwin1234";
    public static void main(String[] args)
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            // read only statement
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM movies");
            while(resultSet.next())
            {
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getDate("date"));
            }

            String sqlQuery = "INSERT INTO movies (name, date) VALUES ( ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sqlQuery);
            pstmt.setString(1, "krish");
            Date utilDate = new Date();
            java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
            System.out.println("data" +date);
            // first way if we have date data type in table
            //pstmt.setDate(2,  date);
            // second way we can also send date in string format
            pstmt.setString(2, "2023-05-06");
            // wrong way to send date string, it follow yyyy-MM-dd
            ////pstmt.setString(2, "26-06-2024");
            pstmt.executeUpdate();

            resultSet.close();
            connection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            try
            {
                resultSet.close();
                connection.close();
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }

    }
}
