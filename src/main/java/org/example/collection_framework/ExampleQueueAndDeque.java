package org.example.collection_framework;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

/*
    Tasks
    1. how to find hash value from hash table in hashset
    2. how priority will be handled by PriorityQueue

 */

public class ExampleQueueAndDeque
{
    public static void main(String[] args)
    {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("devashish");
        queue.add("samarth");
        queue.add("yash");
        queue.add("raj");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        queue.offer("aman");
        System.out.println("after offer: "+queue);
        queue.poll();
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
        // element and peek both are same, gives head of item, but
        // in element if queue is empty then it will throw exception as NoSuchElementException
        System.out.println(queue.element());

        // how priority will be handled by PriorityQueue
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("b");
        priorityQueue.add("a");
        priorityQueue.add("c");
        priorityQueue.add("b");
        System.out.println("priorityQueue: "+priorityQueue);
        priorityQueue.poll();
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());

        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>();

        // stack + queue ( Deque)
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();


    }

}
