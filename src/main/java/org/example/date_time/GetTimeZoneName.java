package org.example.date_time;

import java.util.TimeZone;

public class GetTimeZoneName
{
    public static void main( String args[] ){
        TimeZone zone = TimeZone.getDefault();
        String name = zone.getDisplayName();
        System.out.println("name of default time zone: "+ name);
    }
}
