package org.example.multithreading;
/*
class HandleMultiThreadWithSync extends Thread {
    @Override
    public synchronized void run() {
        synchronized (this) // synchronized block
        {
            String n = Thread.currentThread().getName() +" as ";

            for(int i=1;i<=5;i++)
            {
                System.out.println(n);
            }
            try
            {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

    }
}
*/

class HandleMultiThreadWithoutSync1 extends Thread {
    @Override
    public synchronized void run() // synchronized method
    {
        synchronized(this) // synchronized block
        {
            System.out.println("at synchronized 1");
            String name = Thread.currentThread().getName() +" as ";
            System.out.println("thread name "+name);
            for(int i=1;i<=50;i++)
            {
                System.out.println(name);
                try
                {
                    //Thread.sleep(1000);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

class HandleMultiThreadWithoutSync2 extends Thread {
    @Override
    public synchronized void run() // synchronized method
    {
        synchronized(this) // synchronized block
        {
            System.out.println("at synchronized 2");
            String name = Thread.currentThread().getName() +" as ";
            System.out.println("thread name "+name);
            for(int i=1;i<=50;i++)
            {
                System.out.println(name);
                try
                {
                    //Thread.sleep(1000);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

public class MultiThreadingExample3
{
    public static void main(String[] args) {
        HandleMultiThreadWithoutSync1 t1 = new HandleMultiThreadWithoutSync1();
        HandleMultiThreadWithoutSync2 t2 = new HandleMultiThreadWithoutSync2();
        t1.setName("thread 1");
        t2.setName("thread 2");
        t1.start();
        try
        {
            //Thread.sleep(100);
            t2.start();
            //Thread.sleep(100);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        for(int i=1;i<=5;i++)
        {
            //System.out.println("MAIN METHOD THREAD");
        }
    }

}
