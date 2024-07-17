package org.example.date_time;

import java.util.Calendar;

public class CalendarComparison {
    public static void main(String[] args) {
        Calendar calendar1 = Calendar.getInstance();
        try {
            Thread.sleep(1000); // sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Calendar calendar2 = Calendar.getInstance();

        if (calendar1.before(calendar2)) {
            System.out.println("calendar1 is before calendar2");
        } else if (calendar1.after(calendar2)) {
            System.out.println("calendar1 is after calendar2");
        } else {
            System.out.println("calendar1 is equal to calendar2");
        }
    }
}

