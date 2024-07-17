package org.example.multithreading;

class Q extends Thread{
    public void run(){
        String n = Thread.currentThread().getName();
        try {
            for(int i=1;i<=5;i++)
            {
                System.out.println(n);
                System.out.println("state "+Thread.currentThread().getState());
                System.out.println("isAlive "+Thread.currentThread().isAlive());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
public class SuspendAndResumeThread {
    public static void main(String[] args) {
        try
        {
            Q t1 = new Q();
            Q t2 = new Q();
            Q t3 = new Q();
            t1.setName("thread t1");
            t2.setName("thread t2");
            t3.setName("thread t3");

            t1.start();
            t2.start();
            t2.suspend();
            t3.start();
            t2.resume();
            t1.stop();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

