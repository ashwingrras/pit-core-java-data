package org.example.jdbc;


/*
    1. ResultSet
    2. Statement
    3. execute
    4. executeQuery
    5. executeUpdate
    6. preparedStatement
        SqlInjection
    7. CallableStatement ( use for call stored procedure)
    8. BatchProcessing

    9. Transaction (commit, rollback and savepoint)
    10. RowSet

 */

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallableStatementExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "ashwin1234";

        String sql = "{call GetVotersCount(?, ?)}";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            CallableStatement cstmt = connection.prepareCall(sql);
            // IN parameters
            cstmt.setString(1, "harshit");

            // OUT parameter
            cstmt.registerOutParameter(2, Types.INTEGER);

            // Execute the stored procedure
            cstmt.execute();

            // Retrieve the OUT parameter
            int voterCount = cstmt.getInt(2);

            System.out.println(" voterCount: " + voterCount);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getVoters(String name)
    {
        int count = 10;
        return count;
    }

}

