package org.example.multithreading;

class TestThread extends Thread

{
    @Override
    public void run()
    {
        System.out.println("inside run of TestThread");
    }
}

class TestRunnableThread implements Runnable

{
    @Override
    public void run()
    {
        System.out.println("inside run of TestRunnableThread");
    }

    public void sum()
    {
        System.out.println("inside sum");
    }
}



public class ThreadWithAnnonymusClass {

    public static void main(String[] args) {

        ////First Way
        /*
        TestThread testThread = new TestThread();
        testThread.start();
        */
        ////Second way
        /*
        TestRunnableThread  testRunnableThread = new TestRunnableThread();
        Thread thread1 = new Thread(testRunnableThread);
        thread1.start();
        testRunnableThread.sum();
        */
        //Third way
        Thread thread = new Thread(() ->
        {
            System.out.println("inside run");
            try {
                for(int j=0; j < 50; j++)
                {
                    System.out.println("jjjjjjj value "+j);
                }
                System.out.println("51 Thread state: " + Thread.currentThread().getState());
                Thread.sleep(5000);
                System.out.println("53 Thread state: " + Thread.currentThread().getState());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println("58 Thread state: "+thread.getState());
        thread.start();
        for(int i=0; i < 50; i ++)
        {
            System.out.println("iiiiiii value "+i);
        }
        System.out.println("60 Thread state: "+thread.getState());
        try {
            //thread.join();
            Thread.sleep(1000);
            System.out.println("64 Thread state: "+thread.getState());
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("68 Thread state: "+thread.getState());
        /*
            Thread life cycle:
            1. New
            2. Runnable
            3. waiting
            4. timed_waiting
            5. block
            6. terminate
         */


    }
}
