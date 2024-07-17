package org.example.collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample1
{
    public static void main(String[] args)
    {
        System.out.println("HashMap Example");
        HashMap<String,String> hashMap = new LinkedHashMap<>();
        hashMap.put("name","raju");
        hashMap.put("age","20");
        System.out.println(hashMap);
        hashMap.put("name","yuvraj");
        hashMap.put("address","jaipur");
        System.out.println(hashMap.containsKey("name"));
        System.out.println(hashMap.containsKey("address"));
        hashMap.remove(0);
        System.out.println(hashMap);
        HashMap<Integer,String> hashMap1 = new HashMap<>();
        hashMap1.put(1,"amit");
        hashMap1.put(3,"21");
        System.out.println(hashMap1);
        HashMap<String,Integer> hashMap2 = new HashMap<>();
        hashMap2.put("1",100);
        hashMap2.put("3",300);
        System.out.println(hashMap2);
        HashMap<String,Student> hashMap3 = new HashMap<>();
        StudentAddress studentAddress = new StudentAddress();
        studentAddress.setId(1231);
        hashMap3.put("1", new Student(1,"nischal","988989889","nish@gmail.com",studentAddress));
        System.out.println("now entrySet()");
        for(Map.Entry<String, Student> entry : hashMap3.entrySet())
        {
            System.out.println(entry.getKey() + ", "+ entry.getValue());
        }
        System.out.println("now forEach");
        hashMap3.forEach((key, value) -> {
            System.out.println(key +" , "+ value);
        });

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("nischal");
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("amit");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("prerna");

        HashMap<String, ArrayList<String>> hashMap4 = new HashMap<>();
        hashMap4.put("1",arrayList);
        hashMap4.put("2",arrayList1);
        hashMap4.put("3",arrayList2);
        System.out.println(hashMap4);

    }
}
