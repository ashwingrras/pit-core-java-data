package org.example.multithreading;


/*
    1. NEW
    2. RUNNABLE
    3. TIMED_WAIT ( sleep () )
    4. Waiting (wait infinite time, and  use notify to release lock)
    5. Blocked ( one thread wait and other thread also enter in same state )
    6. Terminate
 */

public class ThreadWaitingStateExample {

    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread waitingThread = new Thread(new WaitingTask(), "WaitingThread 1");
        Thread waitingThread1 = new Thread(new WaitingTask(), "WaitingThread 2");
        Thread notifyingThread = new Thread(new NotifyingTask(), "NotifyingThread");

        waitingThread.start();
        waitingThread1.start();
        try
        {
            // wait for 2 second to check thread current state
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread 1 state: " + waitingThread.getState()); // Should be WAITING
        System.out.println("Main thread 2 state: " + waitingThread1.getState());
        for(int i =0; i < 5; i++)
        {
            System.out.println("Main thread 1 state: " + waitingThread.getState()); // Should be WAITING
            System.out.println("Main thread 2 state: " + waitingThread1.getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Main thread 1 state: " + waitingThread.getState());
        System.out.println("Main thread 2 state: " + waitingThread1.getState());
        //notifyingThread.start();
        try {
            //waitingThread.join();
            synchronized (lock)
            {
                //lock.notify();
                //lock.notify();
                lock.notifyAll();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        /*
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " has the lock. Notifying all.");
            lock.notify(); // Notify the waiting thread
        }
        */
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " after notify."+waitingThread.getState());
    }

    static class WaitingTask implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                try {
                    System.out.println(Thread.currentThread().getName() + " is waiting for the lock.");
                    for(int i =0 ; i < 10 ; i++)
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

    static class NotifyingTask implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " has the lock. Notifying all.");
                // Notify the waiting thread
                lock.notify();
            }
        }
    }
}

