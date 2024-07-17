package org.example.date_time;

/*

        Date
        Calendar
        LocalDate
        LocalTime
        LocalDateTime
        Period
        OffsetDateTime
 */


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateTimeFormatter {
    public static void main(String[] args)
    {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println("offsetDateTime "+offsetDateTime);
        // 1 april to 31 march,
        String[] arr = {"jan","feb","mar"};
        Date now = new Date();
        System.out.println("now "+now);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime "+localDateTime);
        String localDateTimeFormatted = localDateTime.format(java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("localDateTime "+localDateTimeFormatted);
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar "+calendar.getTime());
        // Format the date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormat.format(now);
        System.out.println("Formatted Date: " + formattedDate);
        // Format the time
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = timeFormat.format(now);
        System.out.println("Formatted Time: " + formattedTime);

        // Format both date and time together
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");
        String formattedDateTime = dateTimeFormat.format(calendar.getTime());
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}

