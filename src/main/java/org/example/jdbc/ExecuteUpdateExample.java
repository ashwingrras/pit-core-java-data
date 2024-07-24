package org.example.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteUpdateExample
{
    public static void main(String[] args)
    {
     try
     {
         Connection connection = new DbHelper().getSqlConnection();
         if(connection != null)
         {
             Statement statement = connection.createStatement();
             // for insert in mysql
             /*int insertQueryCount = statement.executeUpdate("insert into student(name, mobileno, emailid, age) values \n" +
                     "('devashish','9999999999','devashish@gmail.com',20)");
             System.out.println("executeUpdate insertQueryCount: "+insertQueryCount);*/
             // for delete in mysql
             /*int deleteQueryCount = statement.executeUpdate("delete from student where name = 'devashish'");
             System.out.println("executeUpdate deleteQueryCount: "+deleteQueryCount);*/
             // for update in mysql
             int updateQueryCount = statement.executeUpdate("update student set mobileno = '9800221122' where name='devashish'");
             System.out.println("executeUpdate updateQueryCount: "+updateQueryCount);
             //structs
             System.out.println("successful executed");
             connection.close();
         }
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
    }
}
