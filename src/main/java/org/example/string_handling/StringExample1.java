package org.example.string_handling;

/*
    String:
    1. immutable
    2. == : reference check
    3. .equals() : value check
    4. concat():

 */

public class StringExample1
{
    public static void main(String[] args)
    {
        String name1 = "ashwin";
        System.out.println(name1);
        name1.concat(", ankit");
        name1 = name1.concat(", devashish");
        System.out.println(name1);
        String name2 = new String("ashwin");
        System.out.println(name1 == name2); // here check reference
        System.out.println(name1.equals(name2));// here check value
        System.out.println(name2.endsWith("n"));
        String a = "A";
        String b = "B";
        System.out.println(b.compareTo(a));
        String address = "70 A, shyam vihar, jaipur";
        System.out.println(address.contains(",jaipur"));
        //equalsignorecase
        //equalsIgnoreCase
        System.out.println(address.charAt(4));
    }

}
