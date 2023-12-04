package polymorphism;

class Parent{
	void properties() {
		System.out.println("Gold + Properties");
	}
	void girls() {
		System.out.println("A + b");
	}}
	class Child extends Parent{
	 void girls() {
		 System.out.println("C + D");
	 }
	}

public class case_5 {

	public static void main(String[] args) {
		Parent ob=new Parent();
		ob.properties();
		ob.girls();
		Child ob1=new Child();
		ob.girls();
		
		

	}

}
