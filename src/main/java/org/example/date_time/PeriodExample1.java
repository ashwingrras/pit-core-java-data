package org.example.date_time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample1
{

    public static void main(String[] args)
    {
        Period period = Period.of(4, 2, 3);
        System.out.println("period "+period);
        period = period.minusMonths(1);
        System.out.println("period "+period);
        LocalDate date = LocalDate.of(2024, 6, 8);
        System.out.println("date "+date);
        period = Period.ofMonths(2);
        System.out.println("period "+period);
        date = date.plus(period);
        System.out.println("date "+date);
    }
}
