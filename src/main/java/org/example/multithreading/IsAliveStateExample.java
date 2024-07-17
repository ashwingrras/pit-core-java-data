package org.example.multithreading;

class Alive extends Thread{
    public void run(){
        String n = Thread.currentThread().getName();
        for(int i=1;i<=5;i++){
            System.out.println(n);
        }
    }
}
public class IsAliveStateExample {
    public static void main(String[] args) {
        Alive t1 = new Alive();
        Alive t2 = new Alive();
        t1.setName("thread t1");
        t2.setName("thread t2");
        System.out.println(t2.isAlive());
        t2.start();
        System.out.println(t2.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
    }
}

