package MAP_java;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding key-value pairs
        linkedHashMap.put("John", 25);
        linkedHashMap.put("Alice", 30);
        linkedHashMap.put("Bob", 22);

        // Accessing values
        int age = linkedHashMap.get("John");
        System.out.println("John's age: " + age);

        // Iterating over the map
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
