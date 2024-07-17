package org.example.multithreading;

class N extends Thread{
    public void run(){
        String n = Thread.currentThread().getName();
        for(int i=1;i<=5;i++){
            System.out.println(n);
        }
    }
}
public class JoinStateExample {
    public static void main(String[] args) {
        N t1 = new N();
        N t2 = new N();
        N t3 = new N();
        t1.setName("thread t1");
        t2.setName("thread t2");
        t3.setName("thread t3");

        t2.start();
        try {
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        t1.start();
        t3.start();
    }
}

