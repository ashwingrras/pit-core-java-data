package org.example.multithreading;

/*

The flag variable is declared as volatile.
This means changes to flag are visible to all threads immediately.
The volatile keyword ensures that when one thread modifies the value of flag,
the change is immediately visible to other threads.
volatile does not guarantee atomicity. For instance, incrementing a volatile
 variable (flag++) is not atomic.
 */
public class VolatileThreadExample {
    //private static volatile boolean flag = false;
    private static volatile boolean flag = false;

    public static void main(String[] args) {

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulate some work with sleep
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            flag = true; // Change the value of the volatile variable
            System.out.println("Writer thread has set flag to true");
        });


        Thread readerThread = new Thread(() -> {
            System.out.println("flag inside readerThread "+flag);
            while (!flag)
            { // Loop until flag becomes true
                // Busy-wait
                System.out.println(flag);
            }
            System.out.println("Reader thread detected flag change to true");
        });

        writerThread.start();
        readerThread.start();

        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

