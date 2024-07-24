package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingExampleWithStatement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "ashwin1234";

        Connection connection = null;
        try  {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            Statement stmt = connection.createStatement();

            // Disable auto-commit mode
            connection.setAutoCommit(false);

            // Add SQL commands to batch
            stmt.addBatch("INSERT INTO trainers (name, age, department, salary) VALUES ('Ashwin', 32, 'HR', 150000.00)");
            stmt.addBatch("INSERT INTO trainers (name, age, department, salary) VALUES ('Ravi', 26, 'IT', 90000.00)");
            stmt.addBatch("INSERT INTO trainers (name, age, department, salary) VALUES ('Vikash', 24, 'Finance', 75000.00)");


            int[] updateCounts = stmt.executeBatch();

            // Commit the transaction
            connection.commit();
            System.out.println("after commit");
            connection.rollback();
            System.out.println("after rollback");
            //int a = 10 / 0;
            //System.out.println(a);
            for (int count : updateCounts)
            {
                System.out.println("transaction Count: " + count);
            }

        } catch (Exception e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                e.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}

