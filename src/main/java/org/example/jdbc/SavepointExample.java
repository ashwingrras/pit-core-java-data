package org.example.jdbc;

import java.sql.*;

public class SavepointExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "ashwin1234";

        Connection connection = null;
        PreparedStatement updateStmt = null;
        Savepoint savepoint = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);

            // Disable auto-commit
            connection.setAutoCommit(false);

            String updateSQL = "UPDATE accounts SET balance = balance + ? WHERE name = ?";
            updateStmt = connection.prepareStatement(updateSQL);


            updateStmt.setBigDecimal(1, new java.math.BigDecimal("200.00"));
            updateStmt.setString(2, "Raju");
            updateStmt.executeUpdate();

            // set savepoint
            savepoint = connection.setSavepoint("BeforeUpdateAmit");

            updateStmt.setBigDecimal(1, new java.math.BigDecimal("-300.00"));
            updateStmt.setString(2, "Amit");
            updateStmt.executeUpdate();

            // Commit
            connection.commit();
            System.out.println("Transaction committed successfully.");

        } catch (Exception e) {
            // Roll back to savepoint on error
            if (connection != null && savepoint != null) {
                try {
                    connection.rollback(savepoint);
                    System.out.println("Rolled back to savepoint.");
                    connection.commit();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {

            try {
                if (updateStmt != null) updateStmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

