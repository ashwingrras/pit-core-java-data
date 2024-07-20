package org.example.collection_framework;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ExampleConcurrentHashMap
{
    public static void main(String[] args)  throws InterruptedException
    {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        //HashMap<String, Integer> map = new HashMap<>();

        Thread thread1 = new Thread(() -> {
            System.out.println("at thread 1 start");
            for (int i = 10; i < 20; i++)
            {
                map.put("key" + i, i);
            }
            //System.out.println("at thread 1 end ");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("at thread 2 start");
            for (int i = 0; i < 10; i++)
            {
                /*if( i == 0)
                {
                    System.out.println("index = "+i);
                }*/
                map.put("key" + i, i);
                /*if( i == 0)
                {
                    System.out.println("value  = "+map.get("key" + i));
                }*/
            }
            //System.out.println("at thread 2 end");
        });

        Thread readerThread = new Thread(() -> {
            System.out.println("at readerThread");
            for (int i = 0; i < 20; i++) {
                //System.out.println("reader thread i = "+i);
                //System.out.println("ConcurrentHashMap Value for key" + i + ": " + map.get("key" + i));
                if(map.get("key" + i) != null)
                {
                    System.out.println("reader thread i = "+i);
                    System.out.println("ConcurrentHashMap Value for key" + i + ": " + map.get("key" + i));
                }

            }
        });

        // Start the threads
        // 10 to 19
        thread1.start();
        // 0 to 9
        thread2.start();
        //readerThread.start();
        ////Wait for the threads to finish
        //readerThread.join();
        thread1.join();
        thread2.join();
        readerThread.start();
        readerThread.join();
        System.out.println("Final size of map: " + map.size());
    }
}
