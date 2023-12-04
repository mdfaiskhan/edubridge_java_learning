package set;

import java.util.HashSet;
import java.util.Set;


public class Hash_set2 {
    public static void main(String[] args) {
       
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(4);
        set1.add(3);
        System.out.println(set1);
        
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        
        Set<Integer> unionSet = new HashSet<>(set1); 
        unionSet.addAll(set2); 

        
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Union Set: " + unionSet);
        
       
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection Set : "+intersectionSet);
        
        
       Set<Integer> Difference=new HashSet<>(set1);
       Difference.removeAll(set2);
       System.out.println("Difference on Set 1 : "+Difference);
       
       Set<Integer> Difference1=new HashSet<>(set2);
       Difference1.removeAll(set1);
       System.out.println("Difference on Set 2 : "+Difference1);
       
       
}
}