package polymorphism;
class AA{
	public void display(Object o) {
		System.out.println("Object");
	}
	public void display(String s) {
		System.out.println("String");
	}
	
}
public class object_string {

	public static void main(String[] args) {
		AA ob=new AA();
		Object o = null;
		ob.display(Object(o));

	}

	private static String Object(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}
