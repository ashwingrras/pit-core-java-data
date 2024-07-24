package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BatchProcessingWithPreparedStatement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "ashwin1234";

        String sql = "INSERT INTO trainers (name, age, department, salary) VALUES (?, ?, ?, ?)";

        try  {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = connection.prepareStatement(sql);
            // Disable auto-commit mode
            connection.setAutoCommit(false);

            // Add SQL commands to batch with different parameters
            pstmt.setString(1, "Nidhi");
            pstmt.setInt(2, 32);
            pstmt.setString(3, "HR");
            pstmt.setBigDecimal(4, new java.math.BigDecimal("50000.00"));
            pstmt.addBatch();

            pstmt.setString(1, "Mohit");
            pstmt.setInt(2, 25);
            pstmt.setString(3, "DESIGN");
            pstmt.setBigDecimal(4, new java.math.BigDecimal("30000.00"));
            pstmt.addBatch();

            // Execute the batch
            int[] updateCounts = pstmt.executeBatch();

            // Commit the transaction
            connection.commit();

            for (int count : updateCounts) {
                System.out.println("transaction Count: " + count);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

