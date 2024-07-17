package org.example.multithreading;

public class ThreadWaitAndBlockedExample
{
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread waitingThread1 = new Thread(new WaitingTask(), "WaitingThread1");
        Thread waitingThread2 = new Thread(new WaitingTask(), "WaitingThread2");
        //Thread timedWaitingThread = new Thread(new ThreadWaitAndBlockedExample.TimedWaitingTask(), "TimedWaitingThread");
        Thread blockedThread1 = new Thread(new BlockedTask(), "BlockedThread1");
        Thread blockedThread2 = new Thread(new BlockedTask(), "BlockedThread2");

        System.out.println("Initial state: " + waitingThread1.getState()); // NEW

        //waitingThread1.start();
        //timedWaitingThread.start();
        blockedThread1.start();
        try {
            // give some time for threads to start and change states
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        blockedThread2.start();
        ///waitingThread2.start();

        try {
            Thread.sleep(2000); // Allow some time for threads to start and change states
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Print the state of each thread
        System.out.println("State of waitingThread1: " + waitingThread1.getState()); // WAITING
        System.out.println("State of waitingThread2: " + waitingThread2.getState()); // WAITING
        //System.out.println("State of timedWaitingThread: " + timedWaitingThread.getState()); // TIMED_WAITING
        System.out.println("State of blockedThread1: " + blockedThread1.getState()); // RUNNABLE or BLOCKED
        System.out.println("State of blockedThread2: " + blockedThread2.getState()); // BLOCKED

        synchronized (lock) {
            //lock.notifyAll(); // This will wake up the waitingThread1
        }
        System.out.println("after lock.notify");
        try {
            waitingThread1.join();
            //timedWaitingThread.join();
            blockedThread1.join();
            blockedThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after join");
        // State of terminated threads
        System.out.println("Final state of waitingThread1: " + waitingThread1.getState()); // TERMINATED
        System.out.println("Final state of waitingThread2: " + waitingThread2.getState()); // TERMINATED
        //System.out.println("Final state of timedWaitingThread: " + timedWaitingThread.getState()); // TERMINATED
        System.out.println("Final state of blockedThread1: " + blockedThread1.getState()); // TERMINATED
        System.out.println("Final state of blockedThread2: " + blockedThread2.getState()); // TERMINATED
    }

    static class WaitingTask implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                try {
                    System.out.println(Thread.currentThread().getName() + " is waiting for the lock.");
                    lock.wait(); // Enters WAITING state
                    System.out.println(Thread.currentThread().getName() + " resumed.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*
    static class TimedWaitingTask implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " is sleeping.");
                Thread.sleep(2000); // Enters TIMED_WAITING state
                System.out.println(Thread.currentThread().getName() + " woke up.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    */

    static class BlockedTask implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                try {
                    System.out.println(Thread.currentThread().getName() + " has the lock.");

                    ///Thread.sleep(1000); // Hold the lock for 1 second
                    for(int i =0; i < 10; i++)
                    {
                        System.out.println("inside loop i "+i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
