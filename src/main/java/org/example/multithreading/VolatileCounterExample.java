package org.example.multithreading;



public class VolatileCounterExample {
    public static volatile int counter = 0;

    public static void main(String[] args) {
        Thread incrementer1 = new Thread(new CounterIncrementer(), "Incrementer-1");
        Thread incrementer2 = new Thread(new CounterIncrementer(), "Incrementer-2");

        incrementer1.start();
        incrementer2.start();

        try {
            incrementer1.join();
            incrementer2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final counter value: " + counter);
    }
}

class CounterIncrementer implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            VolatileCounterExample.counter++; // Incrementing the volatile counter (not atomic)
        }
        System.out.println(Thread.currentThread().getName() + " has finished incrementing.");
    }
}
