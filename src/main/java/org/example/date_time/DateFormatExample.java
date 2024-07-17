package org.example.date_time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
    public static void main(String[] args) {
        Date now = new Date();

        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        String formattedDate = dateFormat.format(now);
        System.out.println("Formatted Date: " + formattedDate);

        // Parse a string into a Date object
        String dateString = "25-12-2025";
        try {
            Date parsedDate = dateFormat.parse(dateString);
            System.out.println("Parsed Date: " + parsedDate);
        } catch (Exception e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }
}

