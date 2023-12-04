package access_modifiers;
//inside the class
//class A{
	
//}
//public class mian {
	//public	static int marks=80;
	//public static void main(String[] args) {
		//System.out.println(marks);

	//}
[p]
//}
//outside the class
//class A{
	//public	static int marks=80;

//}
//public class mian {
	
	//public static void main(String[] args) {
		//System.out.println(A.marks);

	//}

//from another class
public class mian {
	
	public static void main(String[] args) {
		a ob=new a();
	
		System.out.println(ob.marks);
	}

}