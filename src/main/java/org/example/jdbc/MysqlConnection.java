package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
    mysql topics:
    1. create database
    2. drop database
    3. create table
    4. drop
    5. truncate
    6. alter: rename, modify
    7. insert record on table
    8. select / data get
    9. update
    10. delete
    11. transaction: commit, rollback, savepoint
    12. keys: primary, foreign , unique
    13. joins: inner, outer, left, right, self, full
    14. union
    15. intersection
    16. where clause
    17. Wildcards: like, any, in
    18. aggregate: sum, count, min, max, avg
    19. order by: asc, desc
    20. group by
    21. data types: char, varchar, int, date, datetime, float, decimal(10,2)
    22. stored procedure
    23. constraints: null, default, auto increment, check, unique
    24. and, or, not, between, >, <
    25. having
    26. limit
    27. relations: one to one, one to many, many to many, many to one
    belongs to, has many, many to many
    28. alias




 */


class MysqlConnection {
    public static void main(String args[]){
        try{
            //Deprecated, if we import latest version of mysql connected
            //Class.forName("com.mysql.jdbc.Driver");
            // with latest mysql connector
            Class.forName("com.mysql.cj.jdbc.Driver");

            // it is compulsory with older version of mysql connector
            //String jdbcUrl = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
            String jdbcUrl = "jdbc:mysql://localhost:3306/grras";
            Connection con=DriverManager.getConnection(jdbcUrl,"root","ashwin1234");


            Statement stmt=con.createStatement();
            // prepared statement
            // callable
            //
            ResultSet rs=stmt.executeQuery("select * from users");

            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            }


            con.close();

        }catch(Exception e){ System.out.println(e);}

    }
}
