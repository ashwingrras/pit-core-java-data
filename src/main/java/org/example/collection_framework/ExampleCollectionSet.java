package org.example.collection_framework;

import java.util.*;

public class ExampleCollectionSet
{
    public static void main(String[] args) {

        // how to find hash value from hash table
        // unique element, no insertion order maintain
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        System.out.println("set "+set);
        System.out.println("set "+set.size());
        for(String item : set)
        {
            System.out.println(item);
        }

        // order maintain
        Set<String > linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("devahish");
        linkedHashSet.add("aman");
        linkedHashSet.add("ganaga");
        linkedHashSet.add("ankit");
        linkedHashSet.add(null);
        System.out.println("linkedHashSet "+linkedHashSet);

        /*
         maintains elements in sorted order (ascending order).
         doesn't allow null elements,  access and retrieval times are quite fast.
         */
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("ab");
        treeSet.add("aab");
        treeSet.add("abc");
        treeSet.add("abbcd");
        ////treeSet.add(null);
        System.out.println("treeSet "+treeSet);
    }
}
