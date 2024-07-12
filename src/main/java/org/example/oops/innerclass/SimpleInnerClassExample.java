package org.example.oops.innerclass;

/*
    1. non-static inner class
    2. static inner class
    3. class inside method
    4. anonymous class
    5. singleton class

 */

public class SimpleInnerClassExample
{
    int a = 10;

    class InnerClass
    {
        int a = 20;
        int b = 15;
        public void showData()
        {
            System.out.println(" at non-static inner class showData method");
            System.out.println(a);
        }
    }
}
