package polymorphism;

class AAA{
	public void aaa(StringBuffer a){
		System.out.println("String buffer");
	}
	public void aaa(String a) {
		System.out.println("String");
	}
}
public class string_stringbuffer {

	public static void main(String[] args) {
		AAA ob=new AAA();
		ob.aaa("a");

	}

}
