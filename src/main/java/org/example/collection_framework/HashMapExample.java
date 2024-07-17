package org.example.collection_framework;

import java.util.*;

public class HashMapExample
{
    public static void main(String[] args)
    {
        HashMap<Double, Double> hashMap = new HashMap<>();
        hashMap.put(1.1, 1.9);
        hashMap.put(2.2, 2.8);
        System.out.println(hashMap);
        System.out.println(hashMap.get(2.1));
        for(int i =0; i < hashMap.size(); i++)
        {
            System.out.println(hashMap.get(i));
        }
        Set<Map.Entry<Double, Double>> set = hashMap.entrySet();
        System.out.println(set);
        for(Map.Entry<Double, Double> value : set)
        {
            System.out.println("key = "+value.getKey());
            System.out.println("value = "+value.getValue());
        }
        for(Map.Entry<Double, Double> value : hashMap.entrySet())
        {
            System.out.println("key = "+value.getKey());
            System.out.println("value = "+value.getValue());
        }
        System.out.println(hashMap.getOrDefault(1.0, -1.0));
        System.out.println("*********");
        Collection<Double> collection = hashMap.values();
        System.out.println(collection);
        System.out.println(hashMap);
        System.out.println("*********");
        Collection<Integer> collection1 = new ArrayList<>();
        collection1.add(1);
        collection1.add(2);
        collection1.add(1);
        System.out.println(collection1);

    }
}
