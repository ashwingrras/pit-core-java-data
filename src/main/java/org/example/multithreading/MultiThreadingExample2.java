package org.example.multithreading;

import java.util.Date;
/*
    1. NEW
    2. RUNNABLE
    3. TIMED WAIT
    4. TERMINATED

 */

class Test2ThreadWithImplements implements Runnable
{
    @Override
    public void run() {
        System.out.println("at TestThreadWithImplement run method");
        try
        {
            Thread.sleep(6000);
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
        System.out.println("at run method date "+new Date());
        System.out.println("after while loop");
    }
}

public class MultiThreadingExample2
{
    public static void main(String[] args)
    {
        System.out.println("Thread using implements Runnable **********");
        Test2ThreadWithImplements testThreadWithImplements = new Test2ThreadWithImplements();
        Thread thread = new Thread(testThreadWithImplements);
        System.out.println(thread.getState());
        System.out.println(new Date());
        thread.start();
        //currentThread().getState();
        System.out.println(new Date());
        System.out.println(thread.getState());
        try
        {
            Thread.sleep(7000);
            System.out.println(thread.getState());
            System.out.println(new Date());
            Thread.sleep(6000);
            System.out.println(new Date());
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
        System.out.println(thread.getState());
        System.out.println("at last line of main method");
    }
}
