package set;



import java.util.HashSet;
import java.util.Set;

public class Hash_set {

	public static void main(String[] args) {
		Set<String> myseta = new HashSet<>();
		
		myseta.add("Element 1");
		myseta.add("Element 2");
		
		System.out.println(myseta);
		
		myseta.remove("Element 2");
		System.out.println(myseta);

	}

}