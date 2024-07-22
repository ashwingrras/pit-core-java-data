package org.example.jdbc;

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/grras";
        String user = "root";
        String password = "ashwin1234";

        try (Connection conn = DriverManager.getConnection(url, user, password))
        {
            Statement stmt = conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from users");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
