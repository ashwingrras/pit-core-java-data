package org.example.multithreading;


class Bus implements Runnable {
    int available = 2;
    int passenger;
    Bus(int pass)
    {
        this.passenger = pass;
    }

    public synchronized void run() {
        String name = Thread.currentThread().getName();
        System.out.println("name "+name);
        if(available>=passenger)
        {
            System.out.println(name+" Reserved seat");
            available = available-passenger;
        }
        else
        {
            System.out.println(name+" sorry not Reserved seat");
        }
    }


}
public class MultiThreadingExample4 {
    public static void main(String[] args) {
        Bus b =new Bus(1);
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(b);
        t1.setName("yogam");
        t2.setName("devesh");
        t3.setName("ansh");
        //
        t1.start();
        t2.start();
        t3.start();
    }
}
