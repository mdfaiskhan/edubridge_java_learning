package string;
//toUpperCase() , toLowercase() , contains() String , replace()
public class String_upper_lower {

	public static void main(String[] args) {
		String a="hello";
		String b="WORLD";
        System.out.println(a.toUpperCase());
        System.out.println(b.toLowerCase());
        
        System.out.println(a.contains("he"));
        System.out.println(a.trim());
        System.out.println(a.replace("h","e"));
        
	}

}
