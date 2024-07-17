package org.example.date_time;


import java.time.LocalDate;
import java.time.Period;

public class AgeCalculatorUsingPeriod {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1991, 10, 14);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);
        System.out.println("Age: " + age.getYears() + " years, "
                + age.getMonths() + " months, "
                + age.getDays() + " days");
    }
}
