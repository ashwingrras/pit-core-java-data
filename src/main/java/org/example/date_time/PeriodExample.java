package org.example.date_time;

/*


        Date
        Calender
        LocalTime
        LocalDate
        LocalDateTime
        Zone
        Period

 */


import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args)
    {

        Period period1 = Period.of(2, 3, 5);

        Period period2 = Period.ofMonths(6);

        Period period3 = Period.ofDays(10);

        System.out.println("Period 1: " + period1);
        System.out.println("Period 2: " + period2);
        System.out.println("Period 3: " + period3);

        /////////////////////////////////////
        LocalDate date = LocalDate.of(2024, 6, 8);
        Period period = Period.ofMonths(2);

        LocalDate newDate = date.plus(period);
        System.out.println("Original Date: " + date);
        System.out.println("Date after adding period: " + newDate);

        LocalDate earlierDate = date.minus(period);
        System.out.println("Date after subtracting period: " + earlierDate);
        ////////////////////////////

        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 6, 8);

        Period periodBetween = Period.between(startDate, endDate);

        System.out.println("Period between " + startDate + " and " + endDate + ": " + period);
        System.out.println("Years: " + periodBetween.getYears());
        System.out.println("Months: " + periodBetween.getMonths());
        System.out.println("Days: " + periodBetween.getDays());

        ///////////////////////////////////////////////
        Period periodFormat = Period.of(1, 2, 15);

        String formatted = String.format("%d years, %d months, %d days",
                periodFormat.getYears(), periodFormat.getMonths(), periodFormat.getDays());

        System.out.println("Custom formatted period: " + formatted);
        /////
        String isoPeriod = "P1Y2M15D";
        Period periodParsed = Period.parse(isoPeriod); // String To Period
        System.out.println("periodParsed "+periodParsed);
        //////
    }
}

