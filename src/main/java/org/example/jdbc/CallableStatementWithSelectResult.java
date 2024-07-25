package org.example.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class CallableStatementWithSelectResult
{
    static String procedureQuery = "{call GetStudentByName(?)}";
    public static void main(String[] args)
    {
        try
        {
            Connection connection = new DbHelper().getSqlConnection();
            if(connection != null)
            {
                CallableStatement callableStatement = connection.prepareCall(procedureQuery);
                callableStatement.setString(1,"ashwin");
                boolean result = callableStatement.execute();
                System.out.println("result "+result);
                if(result)
                {
                    ResultSet resultSet = callableStatement.getResultSet();
                    while(resultSet.next())
                    {
                        System.out.println(resultSet.getString("name") +", "+resultSet.getString("mobileno"));
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
