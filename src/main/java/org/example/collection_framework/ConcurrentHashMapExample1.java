package org.example.collection_framework;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample1
{

    public static void main(String[] args)
    {
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("1","devesh");

        Thread thread1 = new Thread(() ->
        {
            System.out.println("at thread1");
            concurrentHashMap.put("2","ansh");

        });
        Thread thread2 = new Thread(() ->
        {
            System.out.println("at thread2");
            concurrentHashMap.put("2","yogam");
        });

        thread1.start();
        thread2.start();
        try
        {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(concurrentHashMap);
    }
}
