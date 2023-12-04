package set;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		Set<Integer> set1=new TreeSet<>();
		set1.add(1);
		set1.add(3);
		set1.add(10);
		set1.add(2);
		System.out.println("Set 1 : "+set1);
		
		Set<Integer> set2=new TreeSet<>();
		set2.add(6);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		//set2.add(null);
		System.out.println("Set 2 : "+set2);
		
		Set<Integer> unionset=new TreeSet<>(set1);
		unionset.addAll(set2);
		System.out.println("Union Set : "+unionset);
		
		Set<Integer> intersectionset=new TreeSet<>(set1);
		intersectionset.retainAll(set2);
		System.out.println("intersection Set : "+intersectionset);
	}

}
