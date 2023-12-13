package MAP_java;

import java.util.HashMap;

public class map_ex {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		map.put(101,"bob");
		map.put(102, "Alice");
		map.put(103, "David");
		map.put(104, "John");
		
		//System.out.println(map);
		
	//	System.out.println(map.containsKey(109));
		
	//	System.out.println(map.get(101));
		
	//	System.out.println(map.isEmpty());
		
	//	System.out.println(map.containsValue("bob"));
		
		//System.out.println(map.remove(101));
		//System.out.println();
		
	//	System.out.println(map.replace(101, "faisal"));
		//System.out.println(map);
		System.out.println("keys"+map.keySet());
		System.out.println("Values "+map.values());
		
		
	}

}
