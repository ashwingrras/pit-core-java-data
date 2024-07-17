package org.example.multithreading;
class Z extends Thread {
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
public class MultiThreadExample {
    public static void main(String[] args) {
        Z t1 = new Z();
        Z t2 = new Z();
        Z t3 = new Z();
        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");
        t1.start();
        t2.start();
        t3.start();
        for(int i=1;i<=5;i++){
            //System.out.println("MAIN METHOD THREAD");
        }
        testLoop();
        testLoop();
    }

    public static void testLoop()
    {
        for(int i=1;i<=5;i++){
            //System.out.println("MAIN METHOD THREAD");
        }
    }

}

