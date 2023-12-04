package string;
//equals() and equalsIgnoreCase()
public class string_equals {

	public static void main(String[] args) {
		String a="Hello";
		String b="World";
		String c="Hello";
		String d="HELLO";
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equalsIgnoreCase(d));
		
		
	}

}
