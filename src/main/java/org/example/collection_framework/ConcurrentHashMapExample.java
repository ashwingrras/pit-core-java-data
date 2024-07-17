package org.example.collection_framework;

import java.util.HashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args)
    {
        HashMap<String, Integer> concurrentMap = new HashMap<>();

        // Add elements to the map
        concurrentMap.put("Apple", 10);
        concurrentMap.put("Banana", 20);
        concurrentMap.put("Orange", 30);
        System.out.println("Initial ConcurrentHashMap: " + concurrentMap);
        Runnable task1 = () -> {
            System.out.println("thread1 Initial ConcurrentHashMap: " + concurrentMap);
            concurrentMap.put("Apple", concurrentMap.get("Apple") + 5);
            concurrentMap.put("Banana", concurrentMap.get("Banana") + 10);
            System.out.println("task1 Initial ConcurrentHashMap: " + concurrentMap);
        };
        Runnable task2 = () -> {
            System.out.println("thread2 Initial ConcurrentHashMap: " + concurrentMap);
            concurrentMap.put("Orange", concurrentMap.get("Orange") + 15);
            concurrentMap.put("Grapes", 40);
            System.out.println("task2 Initial ConcurrentHashMap: " + concurrentMap);
        };
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the updated map
        System.out.println("Updated ConcurrentHashMap: " + concurrentMap);
    }
}

