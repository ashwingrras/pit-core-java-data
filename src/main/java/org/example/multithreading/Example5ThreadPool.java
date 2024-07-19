package org.example.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    Thread Pool: where we can use existing thread to rework

 */
public class Example5ThreadPool
{

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        for(int i= 1; i <= 6; i++)
        {
            Runnable worker = new ThreadWorker(i);
            executor.execute(worker);// queue
        }
        System.out.println("after thread worker loop");
        executor.shutdown();
    }

}

class ThreadWorker implements Runnable
{

    int workerId;
    ThreadWorker(int workerId)
    {
        this.workerId = workerId;
    }
    @Override
    public void run()
    {
        System.out.println("Worker " + workerId + " is running on thread " + Thread.currentThread().getName());
        for(int i=1; i <= 10; i++)
        {
            System.out.println("i "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Worker " + workerId + " is complete on thread " + Thread.currentThread().getName());
    }
}
