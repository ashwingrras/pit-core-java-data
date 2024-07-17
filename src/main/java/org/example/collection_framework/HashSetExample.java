package org.example.collection_framework;

import java.util.HashSet;

public class HashSetExample
{
    public static void main(String[] args)
    {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("devesh");
        hashSet.add("ansh");
        hashSet.add("yogam");
        hashSet.add("lalit");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("lalit"));
        for(String item : hashSet)
        {
            System.out.println(item);
        }
        hashSet.add("Devesh");
        hashSet.add("harshit");
        hashSet.add("muskan");
        hashSet.add("himani");
        hashSet.add("ambika");
        hashSet.add("nandini");
        System.out.println(hashSet);
    }
}
