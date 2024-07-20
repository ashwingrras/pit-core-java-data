package org.example.collection_framework;

import java.util.Stack;
import java.util.Vector;

public class ExampleStackAndVector
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.setSize(1);
        stack.set(0, 321);
        stack.push(123);
        stack.getFirst();
        stack.getLast();
        System.out.println("stack as: "+stack);

        Vector<String> vector = new Vector<>();
        vector.add("aman");
        System.out.println(vector.getFirst());
        System.out.println(vector.size());
    }
}
