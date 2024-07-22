package org.example.date_time;

/*
    Date Time Classes:
                               DateTime Format
    Deprecated                  SimpleDateTimeFormatter
    1. DateTime
    2. Calendar

    Newly Added
    3. LocalDate
    4. LocalTime
    5. LocalDateTime
    6. Period
    7. TimeZone
    8. ZoneDateTime

    IST ()
    GMT ()
    UTC ()

 */

import java.util.Date;

public class ExampleDateTimeManagement
{
    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println("date: "+date);
        long dateTimestamp = date.getTime();
        System.out.println("dateTimestamp: "+dateTimestamp);
        // Deprecated
        System.out.println(date.getYear());
        date.setTime(1721620792183L);
        System.out.println("date: "+date);
        date.setDate(1);
        date.setHours(0);
        date.setMinutes(0);
        date.setSeconds(0);
        System.out.println("date: "+date);
        // Last 7 Days
        // end: current Date, start: current - 7
        Date startDate = new Date();
        Date endDate = new Date();
        startDate.setDate(endDate.getDate() - 6);
        System.out.println("startDate: "+startDate);
        System.out.println("endDate: "+endDate);
        // last month record
        // 1 june to 30 june 2024
        // 1 june 00:00
        // 1 july 00:00
        // 30 june 23:59:59:999
        Date currentDate = new Date();
        Date lastMonthStartDate = new Date();
        Date lastMonthEndDate = new Date();
        lastMonthStartDate.setMonth(currentDate.getMonth() - 1);
        lastMonthStartDate.setDate(1);
        lastMonthStartDate.setHours(0);
        lastMonthStartDate.setMinutes(0);
        lastMonthStartDate.setSeconds(0);
        System.out.println("lastMonthStartDate: "+lastMonthStartDate);
        lastMonthEndDate.setDate(1);
        lastMonthEndDate.setHours(0);
        lastMonthEndDate.setMinutes(0);
        lastMonthEndDate.setSeconds(0);
        lastMonthEndDate.setSeconds(lastMonthEndDate.getSeconds() - 1);
        System.out.println("lastMonthEndDate: "+lastMonthEndDate);
        Date selectedStartDate = new Date();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Date selectedEndDate = new Date();
        System.out.println("selectedStartDate: "+selectedStartDate);
        System.out.println("selectedEndDate: "+selectedEndDate);
        if(selectedEndDate.after(selectedStartDate))
        {
            System.out.println("valid date selected");
        }
        else
        {
            System.out.println("please select valid date");
        }
    }
}
