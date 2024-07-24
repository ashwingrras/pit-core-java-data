package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementSelectExample {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "ashwin1234";

        String sql = "SELECT * FROM voters WHERE name = ?";

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, "raju");
            ResultSet resultSet = pstmt.executeQuery();

            while (resultSet.next())
            {
                System.out.println("id: " + resultSet.getInt("id"));
                System.out.println("name: " + resultSet.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

