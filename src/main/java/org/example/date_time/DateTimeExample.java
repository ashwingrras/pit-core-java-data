package org.example.date_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeExample {
    public static void main(String[] args) {
        // Get current time in milliseconds since the Unix epoch
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Current Time in milliseconds since Unix epoch: " + currentTimeMillis);

        // Convert milliseconds to a Date object
        Date currentDate = new Date(currentTimeMillis);
        System.out.println("Current Date: " + currentDate);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Formatted Current Date: " + formattedDate);

        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println("Current Time in New York: " + cal.getTime());

        cal.add(Calendar.DAY_OF_MONTH, 3);
        System.out.println("Date after adding 3 days: " + dateFormat.format(cal.getTime()));

        // Check if the current year is a leap year
        int currentYear = cal.get(Calendar.YEAR);
        boolean isLeapYear = (currentYear % 4 == 0) && (currentYear % 100 != 0 || currentYear % 400 == 0);
        System.out.println("Is current year (" + currentYear + ") a leap year? " + isLeapYear);
    }
}

