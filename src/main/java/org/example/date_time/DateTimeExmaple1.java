package org.example.date_time;

/*
    Deprecated:
    Date
    Calendar

    New java 8
    LocalDate
    LocalTime
    LocalDateTime
    ZoneDateTime

    formatter
    SimpleDateTimeFormatter
    DateTimeFormatter

 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeExmaple1
{
    public static void main(String[] args)
    {

        Date date = new Date();
        System.out.println("date "+date);
        long timestamp = date.getTime();
        System.out.println(date.getTime());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        /*
        date.setHours(23);
        date.setMinutes(70);
        date.setSeconds(59);
        date.setYear(123);
        */
        System.out.println("date "+date);

        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar "+calendar.getTime());
        System.out.println("calendar "+calendar.get(Calendar.YEAR));
        System.out.println("calendar "+calendar.get(Calendar.MONTH));
        System.out.println("calendar "+calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("calendar "+calendar.get(Calendar.DATE));

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm a");
        String strDate = formatter.format(date);
        System.out.println("Date Format with dd/MM/yyyy : "+strDate);
    }
}
