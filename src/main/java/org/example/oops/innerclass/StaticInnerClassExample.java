package org.example.oops.innerclass;

/*
    1. non-static inner class
    2. static inner class
    3. class inside method
    4. anonymous class
    5. singleton class

 */
public class StaticInnerClassExample
{

    static int a = 10;

    static class StaticInnerClass
    {
        //int a = 10;
        public void showData()
        {
            System.out.println("at static inner class showData method");
        }
    }
}
