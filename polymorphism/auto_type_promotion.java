package polymorphism;

class A{
	public void show(int b) {
		System.out.println("INTEGER TYPE");
	}
	public void show(double b) {
		System.out.println("FLOAT TYPE");
	}
}
public class auto_type_promotion {

	public static void main(String[] args) {
	A ob=new A();
	ob.show('c');

	}

}
