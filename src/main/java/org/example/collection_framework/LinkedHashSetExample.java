package org.example.collection_framework;

import java.util.LinkedHashSet;

public class LinkedHashSetExample
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("devesh");
        linkedHashSet.add("ansh");
        linkedHashSet.add("yogam");
        linkedHashSet.add("lalit");
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.contains("lalit"));
        for(String item : linkedHashSet)
        {
            System.out.println(item);
        }
        linkedHashSet.add("Devesh");
        linkedHashSet.add("harshit");
        linkedHashSet.add("muskan");
        linkedHashSet.add("himani");
        linkedHashSet.add("ambika");
        linkedHashSet.add("nandini");
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.reversed());
    }
}
