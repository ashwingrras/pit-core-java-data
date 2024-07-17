package org.example.date_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample
{
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Date Format with MM/dd/yyyy : "+strDate);

        formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy : "+strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);

        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        strDate = formatter.format(date);
        System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);
        ///
        try {
            SimpleDateFormat formatterNew = new SimpleDateFormat("dd/MM/yyyy");
            Date dateStr = formatterNew.parse("06/06/2024");
            System.out.println("Date is: "+date);
        } catch (ParseException e) {e.printStackTrace();}


    }
}
