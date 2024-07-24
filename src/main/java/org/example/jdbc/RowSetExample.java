package org.example.jdbc;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "ashwin1234";

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();

            jdbcRowSet.setUrl(url);
            jdbcRowSet.setUsername(username);
            jdbcRowSet.setPassword(password);
            /////
            jdbcRowSet.setCommand("SELECT * FROM voters");
            jdbcRowSet.execute();

            while (jdbcRowSet.next())
            {
                int id = jdbcRowSet.getInt(1);
                String name = jdbcRowSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

