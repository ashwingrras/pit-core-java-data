package org.example.jdbc;

import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;
import java.io.FileWriter;

public class WebRowSetExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "ashwin1234";

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            WebRowSet webRowSet = RowSetProvider.newFactory().createWebRowSet();
            webRowSet.setUrl(url);
            webRowSet.setUsername(username);
            webRowSet.setPassword(password);
            webRowSet.setCommand("SELECT * FROM products");
            webRowSet.execute();
            while (webRowSet.next())
            {
                int id = webRowSet.getInt("id");
                String name = webRowSet.getString("name");
                double price = webRowSet.getDouble("price");
                System.out.println("ID: " + id + ", Name: " + name + ", Price: $" + price);
            }
            //
            try (FileWriter writer = new FileWriter("products.xml")) {
                webRowSet.writeXml(writer);
            }
            //
            //TODO need to find  solution of below code, not working
            /*
            try (FileReader reader = new FileReader("products.xml"))
            {
                webRowSet.readXml(reader);
                while (webRowSet.next())
                {
                    int id = webRowSet.getInt("id");
                    String name = webRowSet.getString("name");
                    double price = webRowSet.getDouble("price");
                    System.out.println("ID: " + id + ", Name: " + name + ", Price: $" + price);
                }
            }
            */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

