package set;

import java.util.Set;
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        // Declare and instantiate a Set (using HashSet in this example)
        Set<String> mySet = new HashSet<>();

        // Adding elements to the Set
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Orange");

        // Note: Duplicate elements will not be added

        // Displaying the elements of the Set
        System.out.println("Set elements: " + mySet);
    }
}
