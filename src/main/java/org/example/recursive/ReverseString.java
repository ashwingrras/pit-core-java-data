package org.example.recursive;

public class ReverseString {

    public static void main(String[] args)
    {
        String input = "hello";
        String reversed = reverse(input);
        System.out.println("Reversed string is: " + reversed);
    }
    public static String reverse(String str) {
        // Base case
        if (str.isEmpty())
        {
            return str;
        }
        // Recursive case
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }


}

