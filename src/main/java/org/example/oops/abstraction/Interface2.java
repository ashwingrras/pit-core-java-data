package org.example.oops.abstraction;

public interface Interface2
{
    default int divide(int a, int b)
    {
        return a / b;
    }
}
