package org.example.date_time;

import java.time.LocalTime;

public class LocalTimeExample
{
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalTime time_1 = LocalTime.of(19,30,15);
        System.out.println(time_1);
        LocalTime time_2 =time_1.minusHours(5);
        System.out.println(time_2);
        LocalTime time_3 =time_2.minusMinutes(30);
        /*
            LocalTime time2=time1.plusHours(2);
            LocalTime time3=time2.plusMinutes(30);
         */
        System.out.println(time_3);
    }
}
