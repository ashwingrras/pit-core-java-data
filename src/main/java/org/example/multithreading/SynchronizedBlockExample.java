package org.example.multithreading;

class TableSyncBlock
{
    void printTable(int n){
        synchronized(this){//synchronized block
            for(int i=1;i<=5;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(400);
                }catch(Exception e){System.out.println(e);}
            }
        }
    }//end of the method
}

class MySyncBlockThread1 extends Thread{
    TableSyncBlock t;
    MySyncBlockThread1(TableSyncBlock t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MySyncBlockThread2 extends Thread{
    TableSyncBlock t;
    MySyncBlockThread2(TableSyncBlock t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

public class SynchronizedBlockExample{
    public static void main(String[] args){
        TableSyncBlock obj = new TableSyncBlock();//only one object
        MySyncBlockThread1 t1=new MySyncBlockThread1(obj);
        MySyncBlockThread2 t2=new MySyncBlockThread2(obj);
        t1.start();
        t2.start();
    }
}
