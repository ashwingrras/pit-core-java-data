package org.example.jdbc;

import java.sql.*;

/*
    Task:
    1. one to one relation in sql tables: belongs to, one class extends only one class
    2. one to many relation in sql tables: one class has many interfaces
    3. many to many relation in sql tables: has many

    JOIN:
    1. FULL / UNION
    2. LEFT
    3. RIGHT
    4. INNER / INTERSECTION
    5. SELF
    6. CROSS

    stored procedure
    commit, rollback and savepoint

    trigger

    JDBC:
    1. DriverManager
    2. Statement
    3. ResultSet
    4. PreparedStatement
    5. CallableStatement
    6. BatchProcessing
    7. Transaction Management ( Commit, Rollback, SavePoint)
    8. DataBase metadata
    9. RowSet

 */

public class JdbcExample {
    public static void main(String[] args) {
        String url = DataBaseConstant.URL;
        String user = DataBaseConstant.USER;
        String password = DataBaseConstant.PASSWORD;
        try
        {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            // executeQuery is using for select query
            ResultSet rs=stmt.executeQuery("select * from student");
            while(rs.next())
            {
                // getting column data using column name
                System.out.println(rs.getString("name"));
                // getting column data using column index ( index from 1 to n column)
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
