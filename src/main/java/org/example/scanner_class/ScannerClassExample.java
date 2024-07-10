package org.example.scanner_class;

/*
    Scanner: read input stream: file, string, System.in, stream
    next()
    nextLine()
    nextInt()
    n
    hasNext()

    scanner has default delimiter as white space
    poornima,college

    ATM System
    balance : 15000
    1. user pin 4 digit ( 2314)
    2. deposite / withdrawn ( 1. deposite, 2. withdrawn)
    3. withdrawn: ( daily limit 25000)
        entered amount > balance
          enteredAmount < balance
    4. 1 lakh maximum amount for deposite


 */

import java.util.Scanner;

public class ScannerClassExample {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter pin");
        int pin = scanner.nextInt();
        System.out.println("entered pin "+pin);
        System.out.println("enter your account no.");
        scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        System.out.println("entered value "+value);
        /*
        System.out.println("please enter any text");
        String value = scanner.nextLine();
        System.out.println("entered text as "+value);
        */
        /*
        System.out.println("please enter integer value");
        if(scanner.hasNextInt())
        {
            int intValue = scanner.nextInt();
            System.out.println("entered integer value as "+intValue);
        }
        */
        /*
        scanner.useDelimiter(",");
        String secondStrValue = scanner.next();
        System.out.println("entered second value as "+secondStrValue);
        */
        /*
        while(scanner.hasNext())
        {
            String value = scanner.next();
            System.out.println("entered value "+value);
            if(value.equalsIgnoreCase("exit"))
            {
                break;
            }
        }
        */
    }
}
