package org.example.collection_framework;

/*
        Collection Framework
        List:
        1. ArrayList
        2. LinkedList
        3. Stack
        4. Vector
        5. DoublyLinkedList
        Set:
        1. HashSet
        2. LinkedHashSet
        3. TreeSet
        Queue:
        1. PriorityQueue
        2. ArrayDeque
        Map:
        1. HashMap
        2. LinkedHashMap
        3. TreeMap
        4. ConcurrentHashMap
 */
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample2 {

    public static void main(String[] args) throws InterruptedException {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        Thread thread1 = new Thread(() -> {
            System.out.println("at thread 1 start");
            for (int i = 10; i < 20; i++)
            {
                map.put("key" + i, i);
            }
            System.out.println("at thread 1 end ");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("at thread 2 start");
            for (int i = 0; i < 10; i++)
            {
                if( i == 0)
                {
                    System.out.println("index = "+i);
                }

                map.put("key" + i, i);
                if( i == 0)
                {
                    System.out.println("value  = "+map.get("key" + i));
                }
            }
            System.out.println("at thread 2 end");
        });

        Thread readerThread = new Thread(() -> {
            System.out.println("at readerThread");
            for (int i = 0; i < 20; i++) {
                System.out.println("reader thread i = "+i);
                System.out.println("ConcurrentHashMap Value for key" + i + ": " + map.get("key" + i));
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
        readerThread.start();

        ////Wait for the threads to finish
        readerThread.join();
        thread1.join();
        thread2.join();
        System.out.println("Final size of map: " + map.size());
    }
}

