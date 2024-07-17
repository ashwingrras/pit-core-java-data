package org.example.multithreading;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Tasks implements Runnable
{
    private String taskName;

    // constructor of the class Tasks
    public Tasks(String str)
    {
// initializing the field taskName
        taskName = str;
    }

    // Printing the task name and then sleeps for 1 sec
// The complete process is getting repeated five times
    public void run()
    {
        try
        {
            for (int j = 0; j <= 5; j++)
            {
                if (j == 0)
                {
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");

//prints the initialization time for every task
                    System.out.println("Initialization time for the task name: "+ taskName + " = " + sdf.format(dt));

                }
                else
                {
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");

// prints the execution time for every task
                    System.out.println("Time of execution for the task name: " + taskName + " = " +sdf.format(dt));

                }

// 1000ms = 1 sec
                Thread.sleep(1000);
            }

            System.out.println(taskName + " is complete.");
        }

        catch(InterruptedException ie)
        {
            ie.printStackTrace();
        }
    }
}

public class ThreadPoolExampleWithTime
{
    // Maximum number of threads in the thread pool
    static final int MAX_TH = 3;

    // main method
    public static void main(String argvs[])
    {
// Creating five new tasks
        Runnable rb1 = new Tasks("task 1");
        Runnable rb2 = new Tasks("task 2");

// creating a thread pool with MAX_TH number of
// threads size the pool size is fixed
        ExecutorService pl = Executors.newFixedThreadPool(MAX_TH);

// passes the Task objects to the pool to execute (Step 3)
        pl.execute(rb1);
        pl.execute(rb2);

// pool is shutdown
        pl.shutdown();
    }
}
