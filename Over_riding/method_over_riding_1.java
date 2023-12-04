package Over_riding;
//over riding

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

public class method_over_riding_1 {

	public static void main(String[] args) {
		//Parent ob=new Parent();
		//ob.properties();
		//ob.girls();
		//Child ob1=new Child();
		//ob1.girls();
		Parent ob2=new Child();
		ob2.girls();
		ob2.properties();
		
		
		

	}

}