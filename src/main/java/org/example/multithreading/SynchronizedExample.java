package org.example.multithreading;


class TableSync
 {
    synchronized void printTable(int n){//synchronized method
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
            try{
                //Thread.sleep(2000);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

class MySyncThread1 extends Thread{
    TableSync t;
    MySyncThread1(TableSync t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MySyncThread2 extends Thread{
    TableSync t;
    MySyncThread2(TableSync t){
        this.t=t;
    }
    public void run(){
        t.printTable(6);
    }
}

public class SynchronizedExample
{
    public static void main(String[] args){
        TableSync obj = new TableSync();//only one object
        MySyncThread1 t1=new MySyncThread1(obj);
        MySyncThread2 t2=new MySyncThread2(obj);
        t2.start();
        t1.start();
    }
}
