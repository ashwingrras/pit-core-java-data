package org.example.collection_framework;


import java.util.HashMap;

public class HashMapExampleWithThread {

    public static void main(String[] args) throws InterruptedException {
        // Create a HashMap
        //ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Create multiple threads that perform concurrent operations on the map
        Thread writerThread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                //System.out.println("i = "+i);
                map.put("key" + i, i);
            }
        });

        Thread writerThread2 = new Thread(() -> {
            for (int i = 10; i < 20; i++) {
                //System.out.println("i = "+i);
                map.put("key" + i, i);
            }
        });

        Thread readerThread = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                Integer value = map.get("key" + i);
                //System.out.println("value "+value);
                //System.out.println("HashMap value for key" + i + ": " + value);
                if (value != null)
                {
                    System.out.println("HashMap value for key" + i + ": " + value);
                }
            }
        });

        // Start the threads
        writerThread1.start();
        writerThread2.start();
        readerThread.start();
        // Wait for the threads to finish
        writerThread1.join();
        writerThread2.join();
        readerThread.join();

        // Print the final size of the map
        System.out.println("Final size of map: " + map.size());
    }
}

