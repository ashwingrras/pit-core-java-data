package org.example.multithreading;

/*
            multitasking
            1. multiprocessing: each process have different address (heavy weight)
            2. multi threading: every process share same address (light weight)

            multi threading life cycle:
            1. NEW
            2. Runnable
            3. Timed Wait
            4. Waiting
            5. Block
            6. Terminated

            Thread priority
            Thread Pool
            Daemon Thread
            volatile variable

            java other code: sync
            sout() //1
            sout() //2
            Thread: Async
            thread.start();
            //below code will run, this code not wait of thread

            How to create Thread:
            1. Thread class ko extends karke
            2. Runnable class ko implements karke
            3. Thread as a annonymus class bana kar, using lambda expression
         */


/*
        TestThreadWithExtends testThread = new TestThreadWithExtends();
        System.out.println(testThread.getState());
        testThread.start();
        System.out.println(testThread.getState());
        testThread.run();
        System.out.println(testThread.getState());
        try {
            testThread.join();
            System.out.println(testThread.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        */
////////


import java.util.Date;

class TestThreadWithExtends extends  Thread
{

    @Override
    public void run()
    {
        System.out.println("inside TestThread run method");
    }

}

class TestThreadWithImplements implements Runnable
{
    boolean isRun = false;
    @Override
    public void run() {
        System.out.println("at TestThreadWithImplement run method");
        long i = 0;
        while (isRun)
        {
            /*
            if(i > 1000000000000L)
            {
                break;
            }
            i++;
            */
        }
        try
        {
            Thread.sleep(10000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("at run method date "+new Date());
        System.out.println("after while loop");
    }

    public void stop() {
        System.out.println("at stop method, isRun "+isRun);
        isRun = false;
    }
}

public class MultiThreadingExample1
{
    public static void main(String[] args)
    {
        try
        {
        System.out.println("Thread using implements Runnable **********");
        TestThreadWithImplements testThreadWithImplements = new TestThreadWithImplements();
        Date date = new Date();
        System.out.println("111 date "+date);
        Thread thread = new Thread(testThreadWithImplements);
        System.out.println(thread.getState());
        thread.start();
        System.out.println("222 date "+ new Date());
        System.out.println(thread.getState());
        Thread.sleep(2000);
        System.out.println("after sleep, 333 date "+ new Date());
        //thread.wait();
        System.out.println("after sleep "+thread.getState());
        //thread.wait();
        System.out.println(thread.getState());
        //testThreadWithImplements.isRun = false;
        System.out.println("444 date "+ new Date());
        //testThreadWithImplements.stop();
        ///thread.interrupt();
        thread.join();
        System.out.println("555 date "+ new Date());
        System.out.println(thread.getState());
        System.out.println("at last line of code");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
