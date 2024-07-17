package org.example.collection_framework;

import java.util.Stack;

public class StackExample
{
    public static void main(String[] args)
    {

        Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(7);
        stack.add(9);
        stack.addFirst(2);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.push(11);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.contains(11));
    }
}
