package org.example.date_time;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeExample1
{
    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(simpleDateFormat.format(date));
        System.out.println("now using calendar");
        ////
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(calendar.getTime());
    }
}
