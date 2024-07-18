package org.example.multithreading;

/*
    Thread Life Cycle:
    1. NEW: when thread only created not started
    2. RUNNABLE: after start method
    3. TIMED_WAIT: sleep or wait with given millis
    4. BLOCKED: synchronized method / block
    5. WAITING: lock, to resume call notify or notifyAll to resume all locked thread
    6. TERMINATED: when all code executed or after calling join

    // Thread Naming
    // Thread Priority
    // Synchronized method
    // Synchronized block

    // Deadlock: when one resource is waiting to same resource on other thread
    // Daemon Thread: background thread, low priority, and depend on parent thread
    // main thread 1 : stop
    // daemon thread 1; in progress, terminate
    // garbage collector, memory/cache cleaner
    // volatile
    // Thread Pool



 */

public class Example4ThreadWithSyncBlock
{
    private static final Object lock = new Object();
    public static void main(String[] args)
    {
        Thread waitingThread1 = new Thread(new Example4ThreadWithSyncBlock.WaitingThreadTask(), "WaitingThread 1");
        Thread waitingThread2 = new Thread(new Example4ThreadWithSyncBlock.WaitingThreadTask(), "WaitingThread 2");
        System.out.println(waitingThread1.getState());
        waitingThread1.start();
        waitingThread2.start();
        System.out.println(waitingThread1.getState());
        try {
            Thread.sleep(2000);
            System.out.println(waitingThread1.getState());
            synchronized (lock)
            {
                lock.notifyAll();
            }

            System.out.println(waitingThread1.getState());
            System.out.println(" now join the thread");
            //waitingThread1.join();
            Thread.sleep(3000);
            System.out.println(waitingThread1.getState());
            System.out.println(" END OF CLASS MAIN METHOD");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static class WaitingThreadTask implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                try {
                    System.out.println(Thread.currentThread().getName() + " is waiting for the lock.");
                    for(int i =0 ; i < 5 ; i++)
                    {
                        System.out.println("i "+i);
                    }
                    // WAITING state
                    lock.wait(); // waiting state
                    //Thread.sleep(12000); // blocked state
                    System.out.println(Thread.currentThread().getName() + " resumed.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
