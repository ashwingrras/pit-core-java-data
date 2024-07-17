package org.example.collection_framework;

import java.util.Date;
import java.util.LinkedList;

public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(12);
        linkedList.add(0,9);
        linkedList.add(10);
        linkedList.add(2,15);
        System.out.println(linkedList);
        linkedList.remove();
        linkedList.add(14);
        linkedList.add(10);
        linkedList.add(14);
        System.out.println(linkedList);
        linkedList.removeLastOccurrence(14);
        System.out.println(linkedList);
        Date date = new Date();
        System.out.println("date "+date);
    }
}
