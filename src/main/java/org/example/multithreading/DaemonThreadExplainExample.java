package org.example.multithreading;


public class DaemonThreadExplainExample {
    public static void main(String[] args)
    {
        Thread nonDaemonThread = new Thread(new NonDaemonTask(), "NonDaemon Thread");
        // Create a daemon thread
        Thread daemonThread = new Thread(new DaemonTask(), "Daemon Thread");

        daemonThread.setDaemon(true);

        daemonThread.start();
        nonDaemonThread.start();

        System.out.println("Main thread ending.");
    }
}

class NonDaemonTask implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++)
            {
                System.out.println(Thread.currentThread().getName() + " is running: " + i);
                Thread.sleep(1000);
            }
            System.out.println(Thread.currentThread().getName() + " completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DaemonTask implements Runnable {



    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++)
            {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " is running: " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + " completed.");
        }
    }
}

