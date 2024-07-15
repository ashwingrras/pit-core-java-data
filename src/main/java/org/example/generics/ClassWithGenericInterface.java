package org.example.generics;

/*
    generic class with generic interface and generic methods

 */

public class ClassWithGenericInterface<T> implements GenericInterfaceExample1<Integer>, GenericInterfaceExample2<Double>
{
    T var1;

    @Override
    public Integer sum(Integer a, Integer b)
    {
        return a + b;
    }

    @Override
    public Double multiply(Double a, Double b) {
        return a * b;
    }
}
