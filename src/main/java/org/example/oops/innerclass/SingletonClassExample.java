package org.example.oops.innerclass;

public class SingletonClassExample
{

    private static SingletonClassExample singletonClass;

    private SingletonClassExample()
    {

    }

    public static SingletonClassExample getSingletonClass()
    {
        if(singletonClass == null)
        {
            singletonClass = new SingletonClassExample();
        }
        return singletonClass;
    }



}
