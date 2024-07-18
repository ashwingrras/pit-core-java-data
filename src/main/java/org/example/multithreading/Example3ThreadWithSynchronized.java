package org.example.multithreading;


import static org.example.multithreading.Example3ThreadWithSynchronized.lock;

public class Example3ThreadWithSynchronized
{
    static final Object lock = new Object();
    public static void main(String[] args)
    {
        ThreadWithSynchronized obj1 = new ThreadWithSynchronized();
        ThreadWithSynchronized obj2 = new ThreadWithSynchronized();
        Thread1 t1=new Thread1(obj1);
        t1.setName("Thread 1");
        Thread2 t2=new Thread2(obj1);
        t2.setName("Thread 2");
        t1.start();
        System.out.println(t1.getName());
        System.out.println(t1.getState());
        t2.start();
        System.out.println(t2.getName());
        System.out.println(t2.getState());
        try {
            Thread.sleep(1000);
            System.out.println(t2.getName());
            System.out.println(t2.getState());
            System.out.println("----------");
            System.out.println(t1.getName());
            System.out.println(t1.getState());
            t1.join();
            System.out.println(t1.getName());
            System.out.println(t1.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

class ThreadWithSynchronized
{
    //synchronized method
    static synchronized void printTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n +" * "+i+ " = "+n*i);
            try
            {
                 //Thread.sleep(2000);
            }catch(Exception e){System.out.println(e);}
        }
    }

    synchronized void printTableNonStatic(int n)
    {
        for(int i=1;i<=10;i++)
        {
            try
            {
                System.out.println(n +" * "+i+ " = "+n*i);
                Example3ThreadWithSynchronized.lock.wait(); // waiting state
            }catch(Exception e){System.out.println(e);}
        }
    }
}

class Thread1 extends Thread
{
    // Reference / Resource
    ThreadWithSynchronized t;
    Thread1(ThreadWithSynchronized t)
    {
        this.t=t;
    }
    public void run()
    {
        //t.printTable(5);
        //ThreadWithSynchronized.printTable(5);
        t.printTableNonStatic(5);
    }

}
class Thread2 extends Thread
{
    ThreadWithSynchronized t;
    Thread2(ThreadWithSynchronized t)
    {
        this.t=t;
    }
    public void run()
    {

        //t.printTable(6);
        //ThreadWithSynchronized.printTable(6);
        t.printTableNonStatic(6);
    }
}



