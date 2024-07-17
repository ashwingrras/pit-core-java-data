package org.example.multithreading;

/*
    1. Extend Thread
    2. Implement Runnable


 */

class ThreadWithExtend extends Thread
{

    @Override
    public void run()
    {
        System.out.println(" at run ThreadWithExtend");
    }

}

class ThreadWithImplement implements Runnable
{


    @Override
    public void run() {
        System.out.println(" at run ThreadWithImplement, START");
        try {
            Thread.sleep(1000); // TIMED_WAITING
            System.out.println("after sleep run method");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" at run ThreadWithImplement, END");
    }
}

public class Example1MultiThreading
{

    public static void main(String[] args)
    {
        // first way
        /*
        ThreadWithExtend threadWithExtend = new ThreadWithExtend();
        System.out.println();
        threadWithExtend.start();
        */
        // second way
        ThreadWithImplement threadWithImplement = new ThreadWithImplement();
        Thread thread = new Thread(threadWithImplement);
        System.out.println("line no 53: "+thread.getState()); // NEW
        thread.start();

        try
        {
            System.out.println("line no 57: "+thread.getState());//RUNNABLE
            Thread.sleep(3000); //
            System.out.println("line no 59: "+thread.getState());
            thread.join(); // request thread to terminate state
            System.out.println("line no 61: "+thread.getState());
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        //Third way
        /*
        Thread thread1 = new Thread(() -> {
                    System.out.println("at anonoyomus thread");
        });
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        */
        System.out.println("end of main method");
    }

}
