package org.example.date_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
    Date Time Classes:
    Deprecated:
    Date
    Calendar

    New java 8
    LocalDate
    LocalTime
    LocalDateTime
    ZoneDateTime : ZoneId
    Period

    Timestamp
    SimpleDateTimeFormatter
    DateTimeFormatter
 */

/*
    1. last 7 days date time from to  //
    2. last month date time from to
    3. last financial year: 1 april 2023 to 31 march 2024
    4. compare two dates
    5. find current date start time 00:00
    6. yesterday date time from to
    7. calculate hours and minutes between two dates
    8. entered dob age in range 18 to 30 year only: dd/mm/yyyy
 */

//23:59:59:999

public class TimeZoneExample {
    public static void main(String[] args)
    {
        LocalDateTime localDateTime = LocalDateTime.now();
        localDateTime = localDateTime.withYear(2023);
        localDateTime = localDateTime.withMonth(4);
        localDateTime = localDateTime.withDayOfMonth(1);
        localDateTime = localDateTime.toLocalDate().atTime(0,0);
        System.out.println("localDateTime "+localDateTime);
        ZonedDateTime currentDateTime = ZonedDateTime.now();
        System.out.println("zone currentDateTime "+currentDateTime);
        System.out.println("Current Date and Time: " + currentDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
        ZoneId zoneId = ZoneId.of("Asia/Karachi");
        ZonedDateTime newYorkDateTime = currentDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("Date and Time in New York: " + newYorkDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
        ZonedDateTime tokyoDateTime = currentDateTime.withZoneSameInstant(zoneId);
        System.out.println("Date and Time in: " + tokyoDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
    }
}
