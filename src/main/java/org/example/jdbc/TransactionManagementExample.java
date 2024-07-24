package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionManagementExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "ashwin1234";

        Connection connection = null;
        PreparedStatement deductStmt = null;
        PreparedStatement addStmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);

            // Disable auto-commit
            connection.setAutoCommit(false);

            String deductSQL = "UPDATE accounts SET balance = balance - ? WHERE name = ?";
            String addSQL = "UPDATE accounts SET balance = balance + ? WHERE name = ?";

            deductStmt = connection.prepareStatement(deductSQL);
            addStmt = connection.prepareStatement(addSQL);

            // First Query
            deductStmt.setBigDecimal(1, new java.math.BigDecimal("200.00"));
            deductStmt.setString(2, "Amit");
            deductStmt.executeUpdate();

            // Second Query
            addStmt.setBigDecimal(1, new java.math.BigDecimal("200.00"));
            addStmt.setString(2, "Raju");
            addStmt.executeUpdate();

            // Commit the transaction
            connection.commit();
            System.out.println("Transaction committed successfully.");

        } catch (Exception e) {
            // Roll back the transaction on exception
            if (connection != null) {
                try {
                    connection.rollback();
                    System.out.println("Transaction rolled back.");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            // Close connections
            try {
                if (deductStmt != null) deductStmt.close();
                if (addStmt != null) addStmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

