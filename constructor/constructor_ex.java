package constructor;
//parameterised constructor and no argument constructor
class A{
	A() {
		System.out.println("NO_argument constructor");
}
	A(int a,int b){
		System.out.println("parameterised constructor "+(a+b));
	}}
public class constructor_ex {
	public static void main(String[] args) {
	 A ob=new A();
	 A ob1=new A(10,20);
	 }
}
