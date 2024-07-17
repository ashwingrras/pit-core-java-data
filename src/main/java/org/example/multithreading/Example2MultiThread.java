package org.example.multithreading;

class ThreadWithExtendMultiple extends Thread
{

    @Override
    public void run()
    {

        String n = Thread.currentThread().getName() +" as ";
        System.out.println(" at run ThreadWithExtendMultiple START: "+n);
        try
        {
            //int sum = 0;
            //sum = 5;
            for(int i=1;i<=5;i++)
            {
                System.out.println(n);
                //Thread.sleep(1000);
                Example2MultiThread.sum++;
            }
            System.out.println("sum as "+Example2MultiThread.sum +", thread: "+n);
            Thread.sleep(1000);
        }
         catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(" at run ThreadWithExtendMultiple END: "+n);
    }

}

public class Example2MultiThread
{
    public static int sum = 0;
    public static void main(String[] args)
    {

        ThreadWithExtendMultiple thread1 = new ThreadWithExtendMultiple();
        thread1.setName("Thread 1");
        ThreadWithExtendMultiple thread2 = new ThreadWithExtendMultiple();
        thread2.setName("Thread 2");
        ThreadWithExtendMultiple thread3 = new ThreadWithExtendMultiple();
        thread3.setName("Thread 3");
        thread3.setPriority(10);
        thread1.setPriority(5);
        thread2.setPriority(1);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
