package org.example.date_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;

/*

   LocalDate
   LocalTime
   LocalDateTime
   Zone
   Month
 */

public class CalendarExample {
    public static void main(String[] args) {
        // Get a Calendar instance
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.getCalendarType());
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Note: January is 0
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println("Current Date: " + dayOfMonth + "/" + month + "/" + year);
        System.out.println("Current Time: " + hour + ":" + minute + ":" + second);

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.YEAR, 1970);
        /*calendar1.set(Calendar.MONTH, 6);
        calendar1.set(Calendar.DAY_OF_MONTH, 1);*/
        System.out.println(calendar1.getTime());
        System.out.println(calendar1.getTimeInMillis());

        LocalDateTime localDateTime = LocalDateTime.now();
        /*localDateTime = localDateTime.withYear(1970);
        localDateTime = localDateTime.withMonth(1);
        localDateTime = localDateTime.withDayOfMonth(1);
        localDateTime = localDateTime.withHour(0);
        localDateTime = localDateTime.withMinute(0);*/
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zoneDateTime : "+zonedDateTime);
        System.out.println(localDateTime);
        System.out.println("localDateTime "+localDateTime.toEpochSecond(ZoneOffset.UTC));
        zonedDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("zonedDateTime "+zonedDateTime);

        ////
        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER); // December is 11
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        calendar.set(Calendar.HOUR_OF_DAY, 12);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        /*System.out.println("Updated Date: " + calendar.get(Calendar.DAY_OF_MONTH) + "/" +
                (calendar.get(Calendar.MONTH) + 1) + "/" + calendar.get(Calendar.YEAR));
        System.out.println("Updated Time: " + calendar.get(Calendar.HOUR_OF_DAY) + ":" +
                calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));*/

        calendar.add(Calendar.DAY_OF_MONTH, 10);

//        System.out.println("Date after adding 10 days: " + calendar.get(Calendar.DAY_OF_MONTH) + "/" +
//                (calendar.get(Calendar.MONTH) + 1) + "/" + calendar.get(Calendar.YEAR));
    }
}

