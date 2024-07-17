package org.example.multithreading;

class ThreadPriorityThreadClass extends Thread{
    public void run(){
        String currentThreadName = currentThread().getName();
        try {
            for(int i=1; i<= 1; i++)
            {
                System.out.println(currentThreadName);
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}


public class ThreadPriorityExample {
    public static void main(String[] args) {
        ThreadPriorityThreadClass t1 = new ThreadPriorityThreadClass();
        ThreadPriorityThreadClass t2 = new ThreadPriorityThreadClass();
        ThreadPriorityThreadClass t3 = new ThreadPriorityThreadClass();
        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");
        t1.setPriority(10);
        t2.setPriority(4);
        t3.setPriority(7);
        t1.start();
        t2.start();
        t3.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t1.setPriority(10);
        //t2.setPriority(2);
        //t3.setPriority(10);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
    }
}

