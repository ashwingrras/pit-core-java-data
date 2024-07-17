package org.example.collection_framework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList.size());
        arrayList.add(12);
        arrayList.add(10);
        //arrayList.add(5, 10);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.add(1,11);
        arrayList.add(3,15);
        System.out.println(arrayList);
        arrayList.addAll(arrayList);
        System.out.println(arrayList);
        System.out.println(arrayList.get(5));
        System.out.println(arrayList.remove(2));
        System.out.println(arrayList);
        // for, while, do while, enhanced for, forEach
        System.out.println("normal for loop");
        for(int i=0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }
        System.out.println("enhanced for loop");
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
        System.out.println("for each loop");
        arrayList.forEach(integer -> System.out.println(integer));
        ////
        Iterator itr = arrayList.iterator();
        //
        System.out.println("iterator example");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        //arrayList.removeIf(arrayList::contains);
        arrayList.removeIf(integer -> integer < 13);
        System.out.println(arrayList);
    }
}
