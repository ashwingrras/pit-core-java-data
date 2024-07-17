package org.example.collection_framework;

import java.util.ArrayDeque;

public class DequeExample
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(14);
        deque.add(18);
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        deque.push(20);
        System.out.println(deque);
        deque.pop();
        System.out.println(deque);
        deque.offer(22);
        System.out.println(deque);
    }
}
