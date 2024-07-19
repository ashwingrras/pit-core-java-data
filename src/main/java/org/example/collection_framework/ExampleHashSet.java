package org.example.collection_framework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ExampleHashSet
{
    public static void main(String[] args)
    {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(101);
        hashSet.add(102);
        hashSet.add(103);
        hashSet.add(104);
        hashSet.add(105);
        hashSet.add(103);
        System.out.println("hashset: "+hashSet);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
    }
}
