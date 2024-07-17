package org.example.date_time;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CurrentDateTimeExample {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        ////
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println(java.time.LocalDate.now());
        System.out.println(java.time.LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(java.time.Clock.systemUTC().instant());
        //////
        long millis = System.currentTimeMillis();
        System.out.println("millis "+millis);
        // creating a new object of the class Date
        Date dateNew = new Date(millis);
        System.out.println(dateNew);
    }
}
