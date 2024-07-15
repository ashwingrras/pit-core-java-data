package org.example.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass
{
    public static void main(String[] args)
    {
        GenericClassExample1 genericClassExample1 = new GenericClassExample1();
        genericClassExample1.setVariable("Poornima");
        System.out.println(genericClassExample1.getVariable());
        genericClassExample1.setVariable(1234);
        System.out.println(genericClassExample1.getVariable());
        genericClassExample1.setVariable(false);
        System.out.println(genericClassExample1.getVariable());
        genericClassExample1.setVariable(45.87);
        System.out.println(genericClassExample1.getVariable());
        ArrayList<Student> arrayList = new ArrayList<>();
        Student student1 = new Student(101, "Devashish");
        Student student2 = new Student(102, "Ankit");
        arrayList.add(student1);
        arrayList.add(student2);
        GenericClassExample1<String> genericClassExample2 = new GenericClassExample1<>();
        genericClassExample2.setVariable("only string value");
        GenericClassExample1<Integer> genericClassExample3 = new GenericClassExample1<>();
        genericClassExample3.setVariable(12321);

        // multi param generic class
        GenericClassMultiParameter<Integer, String> genericClassMultiParameter = new GenericClassMultiParameter<>(101,"devashis");
        System.out.println(genericClassMultiParameter.getReceive());

        GenericClassMultiParameter<String, Integer> genericClassMultiParameter2 = new GenericClassMultiParameter<>("XL",200);
        System.out.println(genericClassMultiParameter2.getReceive());

        Integer[] intArr = {2, 4, 3, 1};
        System.out.println(Arrays.toString(getArray(intArr)));

        Double[] doubleArr = {2.5, 4.0, 3.1, 1.8};
        System.out.println(Arrays.toString(getArray(doubleArr)));

        String[] strArr = {"a", "B", "C", "D"};
        System.out.println(Arrays.toString(getArray(strArr)));

        System.out.println(getArrayMaxValue(strArr));
    }

    public static int getValue()
    {
        return 1;
    }

    public static  <T> T[] getArray(T[] array)
    {
        return array;
    }

    public static  <T> T getArrayMaxValue(T[] array)
    {
        T a = array[0];
        return a;
    }

    public static  <T> int getArraySecondMaxValue(T[] array)
    {

        return (int) array[0];
    }

    public static  <T> double getArraySecondMaxValueDouble(T[] array)
    {

        return (double) array[0];
    }

    public <T> int getLastValue(T param)
    {
        return 10;
    }

    public <T> int getSumValue(T param1, T param2)
    {
        return (int) param1 + (int)param2;
    }
    public <T extends Number> double getMultiplyValue(T param1, T param2)
    {
        return param1.doubleValue() + param2.doubleValue();
    }

}
