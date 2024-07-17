package org.example.multithreading;

public class WaitingStateExample {

    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread waitingThread = new Thread(new WaitingTask(), "WaitingThread");
        Thread notifyingThread = new Thread(new NotifyingTask(), "NotifyingThread");

        waitingThread.start();
        notifyingThread.start();
    }

    static class WaitingTask implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                try {
                    System.out.println(Thread.currentThread().getName() + " is going to wait.");
                    lock.wait(); // This will put the thread in waiting state
                    System.out.println(Thread.currentThread().getName() + " is resumed.");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }
        }
    }

    static class NotifyingTask implements Runnable {
        @Override
        public void run() {
            // Adding sleep to ensure WaitingTask runs first and enters the waiting state
            try {
                Thread.sleep(1000); // Sleep for a bit to ensure the waiting thread gets to wait()
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }

            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " is going to notify.");
                lock.notify(); // This will wake up the waiting thread
                System.out.println(Thread.currentThread().getName() + " has notified.");
            }
        }
    }
}
