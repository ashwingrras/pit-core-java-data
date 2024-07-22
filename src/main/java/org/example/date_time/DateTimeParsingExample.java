package org.example.date_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeParsingExample {
    public static void main(String[] args) {

        String dateTimeString = "2024/06/04 15:30:00";
        String dob =  "14/10/1991";
        String pattern = "yy/MM/dd HH:mm:ss";
        String dobPattern = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        SimpleDateFormat dateFormatDob = new SimpleDateFormat(dobPattern);
        try
        {
            Date parsedDate = dateFormat.parse(dateTimeString);
            Date parsedDateDob = dateFormatDob.parse(dob);
            System.out.println("Parsed Date: " + parsedDate);
            System.out.println("Parsed DOB Date: " + parsedDateDob);
            System.out.println(dateFormat.format(parsedDate));
        } catch (ParseException e)
        {
            System.err.println("Error parsing date-time string: " + e.getMessage());
        }
    }
}

