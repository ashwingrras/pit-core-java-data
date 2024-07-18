package org.example.multithreading;

public class ThreadVolatileVariableExample
{
    static boolean isRunning = true;
    static  int index = 0;
    public static void main(String[] args)
    {
        index = 0;
        VolatileClassThread volatileClassThread = new VolatileClassThread();
        //volatileClassThread.start();
        try {
            //Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Thread thread1 = new Thread(() ->
        {
            try {
                System.out.println("at thread 1");
                Thread.sleep(2000);
                isRunning = false;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread thread2 = new Thread(() ->
        {
            try {
                System.out.println("at thread 2, isRunning "+isRunning);
                while (isRunning)
                {
                    index = index + 1;
                    System.out.println("at while loop, index "+index);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        thread2.start();
        thread1.start();
        //volatileClassThread.stopThread();
    }

}


class VolatileClassThread extends  Thread
{
    private boolean isRunning = true;
    @Override
    public void run()
    {
        System.out.println("at run method");
        while (isRunning)
        {
            System.out.println("at while loop");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void stopThread()
    {
        System.out.println("at stopThread method");
        isRunning = false;
    }

}