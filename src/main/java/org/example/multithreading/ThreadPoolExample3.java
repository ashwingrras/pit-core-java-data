package org.example.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample3
{

    public static void main(String[] args)
    {
        try
        {
            ExecutorService executorService = Executors.newFixedThreadPool(5);

            ThreadPoolThread  threadPoolThread = new ThreadPoolThread(1);
            Thread thread = new Thread(threadPoolThread);
            //thread.start();
            Thread thread1 = new Thread(threadPoolThread);
            //thread1.start();

            Runnable  runnable1 = new ThreadPoolThread(2);
            Runnable  runnable2 = new ThreadPoolThread(3);

            executorService.execute(runnable1);
            executorService.execute(runnable2);
            executorService.execute(runnable1);
            executorService.execute(runnable2);
            executorService.execute(runnable1);
            executorService.execute(runnable2);
            executorService.execute(runnable1);
            executorService.execute(runnable2);
            ////

            executorService.execute(runnable1);
            executorService.execute(runnable2);
            executorService.shutdown();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

class ThreadPoolThread implements Runnable
{
    int threadId;

    ThreadPoolThread(int threadId)
    {
        this.threadId = threadId;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadId + " is START $$$$ on thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Thread " + threadId + " is END ***** on thread " + Thread.currentThread().getName());
    }
}


