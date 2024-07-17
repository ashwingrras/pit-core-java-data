package org.example.collection_framework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample
{
    public static void main(String[] args)
    {

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(4);
        queue.add(5);
        queue.add(6);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue);
    }
}
