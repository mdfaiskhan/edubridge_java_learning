package MAP_java;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs
        treeMap.put("John", 25);
        treeMap.put("Alice", 30);
        treeMap.put("Bob", 22);

        // Accessing values
      //  int age = treeMap.get("John");
      //  System.out.println("John's age: " + age);

        // Iterating over the map
       // for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
       //     System.out.println(entry.getKey() + ": " + entry.getValue());
 //       }
       // System.out.println(treeMap.containsKey("John"));
        //System.out.println(treeMap.containsValue(30));
        //System.out.println(treeMap.isEmpty());
        
        System.out.println(treeMap.size());
    }
}
