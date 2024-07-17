package org.example.multithreading;

class MyTask implements Runnable {
    private Object lock;

    public MyTask(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " is waiting");
            try {
                lock.wait(); // Thread enters the waiting state
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " is awake");
        }
    }
}

public class WaitingStateExample1 {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread thread1 = new Thread(new MyTask(lock), "Thread 1");
        Thread thread2 = new Thread(new MyTask(lock), "Thread 2");

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(2000); // Sleep for 2 seconds to ensure both threads are waiting
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (lock) {
            lock.notifyAll(); // Notify all waiting threads
        }
    }
}

