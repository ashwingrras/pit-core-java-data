package org.example.collection_framework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
    1. HashMap
    2. LinkedHashMap
    3. TreeMap

    thread-safe
    4. ConcurrentHashMap

 */
public class ExampleCollectionMap
{
    public static final String MAP_DEFAULT_VALUE = "Not Found";
    public static void main(String[] args)
    {
        // [3, 4, 1, 5, 6];
        // { 1: '', 3:'', 5: ''};
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1,"Devashish");
        hashMap1.put(3,"Aman");
        hashMap1.put(2,"Samarth");
        hashMap1.put(6,"gana");
        hashMap1.put(5,"raj");
        System.out.println("hashMap1: "+hashMap1);
        System.out.println(hashMap1.get(2));
        System.out.println(hashMap1.get(5));
        System.out.println(hashMap1.getOrDefault(5,MAP_DEFAULT_VALUE));
        System.out.println(hashMap1.containsKey(3));
        System.out.println(hashMap1.containsKey(8));

        LinkedHashMap<Integer, String> linkedHashMap1 = new LinkedHashMap<>();
        linkedHashMap1.put(1,"Devashish");
        linkedHashMap1.put(3,"Aman");
        linkedHashMap1.put(2,"Samarth");
        linkedHashMap1.put(6,"gana");
        linkedHashMap1.put(5,"raj");
        linkedHashMap1.put(null,"raja");
        linkedHashMap1.put(null,"vikash");
        System.out.println("linkedHashMap1: "+linkedHashMap1);

        TreeMap<String , String> treeMap1= new TreeMap<>();
        treeMap1.put("101","devashish");
        treeMap1.put("102","aman");
        treeMap1.put("103","ankit");
        //treeMap1.putFirst(100,"aman");
        System.out.println(treeMap1.keySet());
        System.out.println(treeMap1.values());
        System.out.println("treeMap1: "+treeMap1);


    }
}
