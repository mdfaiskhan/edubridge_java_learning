package variables;
class abcd {
	static String a="100";
	static String father_name="Father";
	
	static {
		System.out.println(father_name);
	}
}
public class staticvariable {
	static String id="1HK19CS084";
	static String name="Mohammed Faisal Khan";
	static String Department="Computer Science";
	static String a="10";
	public static void main(String[] args) {
	System.out.println(a);
	System.out.println(abcd.a);
	System.out.println("your ID is "+id);
	System.out.println("your ID is "+name);
	System.out.println("your ID is "+Department);
	System.out.println(abcd.a);

	}

}
