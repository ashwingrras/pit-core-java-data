package org.example.date_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ExampleCalendar
{
    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar: "+calendar);
        System.out.println("calendar getTime(): "+calendar.getTime());
        System.out.println(calendar.getFirstDayOfWeek());
        System.out.println(calendar.getTimeInMillis());
        calendar.set(2024, 7, 22, 10, 10, 00);
        calendar.set(Calendar.YEAR,2023);
        System.out.println(calendar.getTime());

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.YEAR, 1970);
        /*calendar1.set(Calendar.MONTH, 6);
        calendar1.set(Calendar.DAY_OF_MONTH, 1);*/
        System.out.println(calendar1.getTime());
        System.out.println(calendar1.getTimeInMillis());

        Date date = new Date();
        date.setHours(date.getHours() + 3);
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        ////simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(simpleDateFormat.format(date));

    }
}
