package org.example.date_time;

import com.mysql.cj.protocol.a.TimeTrackingPacketSender;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExampleLocalDateTime
{
    public static void main(String[] args)
    {
        // To Get Current Date
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: "+localDate);
        System.out.println(localDate.getMonthValue());

        localDate = localDate.minusDays(21);
        System.out.println("localDate: "+localDate);
        // To Get Current Time
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime: "+localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: "+localDateTime);
    }
}
