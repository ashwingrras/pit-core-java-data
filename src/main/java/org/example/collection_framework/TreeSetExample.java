package org.example.collection_framework;

import java.util.TreeSet;

public class TreeSetExample
{
    public static void main(String[] args)
    {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("devesh");
        treeSet.add("ansh");
        treeSet.add("yogam");
        treeSet.add("lalit");
        System.out.println(treeSet);
        treeSet.add("Devesh");
        treeSet.add("harshit");
        treeSet.add("muskan");
        treeSet.add("himani");
        treeSet.add("ambika");
        treeSet.add("nandini");
        System.out.println(treeSet);
        treeSet.pollLast();
        System.out.println(treeSet);
        treeSet.pollFirst();
        System.out.println(treeSet);
        System.out.println(treeSet.floor("d"));
        System.out.println(treeSet.subSet("a","b"));
        System.out.println(treeSet.reversed());
        System.out.println(treeSet.floor("hi"));
    }
}
