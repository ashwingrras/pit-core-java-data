package org.example.collection_framework;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Creating a map
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Retrieving a value
        System.out.println("Value for key 'Apple': " + map.get("Apple")); // Output: 1

        // Checking for a key
        System.out.println("Contains key 'Banana': " + map.containsKey("Banana")); // Output: true

        // Iterating over keys
        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // Iterating over values
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }

        // Iterating over key-value pairs
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
