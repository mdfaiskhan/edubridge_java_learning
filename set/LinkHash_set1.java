package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHash_set1 {

	public static void main(String[] args) {
		Set<Integer> set1=new LinkedHashSet<>();
		set1.add(1);
		set1.add(4);
		set1.add(2);
		System.out.println("Set 1 : "+set1);
		
		Set<Integer> set2=new LinkedHashSet<>();
		set2.add(4);
		set2.add(6);
		set2.add(5);
		System.out.println("Set 2 : "+set2);
		
		Set<Integer> unionset=new LinkedHashSet<>(set1);
		unionset.addAll(set2);
		System.out.println("Union :"+unionset);
		
		Set<Integer> intersectionset=new LinkedHashSet<>(set1);
		intersectionset.retainAll(set2);
		System.out.println("Intersection : "+intersectionset);
	}

}
