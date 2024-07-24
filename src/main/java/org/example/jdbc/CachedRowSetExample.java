package org.example.jdbc;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;

public class CachedRowSetExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "ashwin1234";

        Connection conn = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            //
            conn = DriverManager.getConnection(url, username, password);
            // Disable autocommit
            conn.setAutoCommit(false);
            CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
            cachedRowSet.setUrl(url);
            cachedRowSet.setUsername(username);
            cachedRowSet.setPassword(password);


            cachedRowSet.setCommand("SELECT * FROM products");
            cachedRowSet.execute();

            // Manipulate data offline
            while (cachedRowSet.next())
            {
                double price = cachedRowSet.getDouble("price");
                cachedRowSet.updateDouble("price", price * 1.10);
                cachedRowSet.updateRow();
            }

            // Reconnect to the database and update
            cachedRowSet.acceptChanges();
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }
}

