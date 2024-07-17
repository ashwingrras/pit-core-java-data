package org.example.date_time;

import java.util.Date;

public class DateComparison {
    public static void main(String[] args) {
        Date date1 = new Date();
        try {
            Thread.sleep(1000); // sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date date2 = new Date();

        if (date1.before(date2)) {
            System.out.println("date1 is before date2");
        } else if (date1.after(date2)) {
            System.out.println("date1 is after date2");
        } else {
            System.out.println("date1 is equal to date2");
        }
    }
}

