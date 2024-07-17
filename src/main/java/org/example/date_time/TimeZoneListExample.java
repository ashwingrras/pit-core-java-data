package org.example.date_time;

import java.util.TimeZone;

public class TimeZoneListExample {
    public static void main( String[] args)
    {
        String[] id = TimeZone.getAvailableIDs();
        System.out.println("TimeZone as : ");
        for (String s : id)
        {
            System.out.println(s);
        }
    }
}
