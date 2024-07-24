package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLConnectionExample {
    public static void main(String[] args) {
        ////String url = "jdbc:mysql://localhost:3306/grras";
        String url = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "ashwin1234";

        try {
            // Load the JDBC driver
            ////Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            String query1 = "SELECT * FROM users as usr left JOIN ordersMulti as ords ON usr.id = ords.id union SELECT * FROM users as usr right JOIN ordersMulti as ords ON usr.id = ords.id";
            String query2 = "update voters set age = 24 where name = 'nishchal';";
            String query3 = "insert into voters(id, name, age, country) values (110, 'Nishchal',19,'USA');";

            String enteredName = "raju";
            String queryWithUserInputValue  = "update voters set age = 24 where name = "+enteredName;

            String query4 = "";

            int updateCount = statement.executeUpdate(query2);
            System.out.println("updateCount "+updateCount);

            ResultSet resultSet = statement.executeQuery(query3);
            // Process the result set
            while (resultSet.next())
            {
                System.out.println(resultSet.getString("age")+" , "+resultSet.getString("name"));
            }

            // Close the result set, statement, and connection
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

