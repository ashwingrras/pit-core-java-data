package org.example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

public class JdbcTransactionManagementExample
{
    public static void main(String[] args)
    {
        Connection connection = null;
        PreparedStatement deductStmt = null;
        PreparedStatement addStmt = null;
        PreparedStatement insertStmt = null;
        Savepoint savepoint = null;
        try
        {
            connection = new DbHelper().getSqlConnection();
            if(connection != null)
            {
                // Disable auto-commit
                connection.setAutoCommit(false);
                String deductSQL = "UPDATE accounts SET balance = balance - ? WHERE name = ?";
                String addSQL = "UPDATE accounts SET balance = balance + ? WHERE name = ?";
                String insertSQL = "insert into accounts (name, balance) values (?,?)";

                deductStmt = connection.prepareStatement(deductSQL);
                addStmt = connection.prepareStatement(addSQL);
                insertStmt = connection.prepareStatement(insertSQL);

                // First Query
                deductStmt.setBigDecimal(1, new java.math.BigDecimal("100.00"));
                deductStmt.setString(2, "Amit");
                deductStmt.executeUpdate();

                insertStmt.setString(1,"vishnu");
                insertStmt.setBigDecimal(2,new java.math.BigDecimal("800.00"));
                insertStmt.executeUpdate();

                savepoint = connection.setSavepoint("BeforeUpdateRaju");

                int[] a = new int[1];
                System.out.println(a[10]);

                // Second Query
                addStmt.setBigDecimal(1, new java.math.BigDecimal("150.00"));
                addStmt.setString(2, "Raju");
                addStmt.executeUpdate();

                // Commit the transaction
                connection.commit();
                System.out.println("Transaction committed successfully.");
            }
        }
        catch (Exception e)
        {
            if (connection != null) {
                try
                {
                    System.out.println("inside catch exception, now rollback");
                    //connection.rollback(savepoint);
                    //connection.rollback();
                    connection.commit();
                    System.out.println("Transaction rolled back.");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        }
        finally {
            // Close connections
            try {
                if (deductStmt != null) deductStmt.close();
                if (addStmt != null) addStmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
}
