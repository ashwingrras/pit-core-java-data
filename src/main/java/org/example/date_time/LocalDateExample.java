package org.example.date_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class LocalDateExample
{
    public static void main(String[] args)
    {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.isLeapYear());
        System.out.println(localDate.atTime(10,10));
        System.out.println(localDate.atStartOfDay());
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZonedDateTime newYorkDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Bangkok"));
        System.out.println("Japan "+newYorkDateTime);
        System.out.println("Date and Time in Japan: " + newYorkDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));

        /*
        String[] id = TimeZone.getAvailableIDs();
        System.out.println("TimeZone as : ");
        for (String s : id)
        {
            System.out.println(s);
        }
        */

    }
}
