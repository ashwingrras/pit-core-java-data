package org.example.multithreading;

class TableStaticSync
{
    synchronized static void printTable(int n)
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(n*i);
            try
            {
                Thread.sleep(400);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
class MyStaticSyncThread1 extends Thread{
    public void run(){

        TableStaticSync.printTable(5);
        //new TableStaticSync().printTable(5);
    }
}
class MyStaticThread2 extends Thread{
    public void run(){

        TableStaticSync.printTable(100);
        //new TableStaticSync().printTable(100);
    }
}

public class StaticSynchronizationExample
{
    public static void main(String[] args)
    {
        MyStaticSyncThread1 t1=new MyStaticSyncThread1();
        MyStaticThread2 t2=new MyStaticThread2();
        t1.start();
        t2.start();
    }
}