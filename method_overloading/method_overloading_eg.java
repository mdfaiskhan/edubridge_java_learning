package method_overloading;

class Test1{
	public void display() {
		System.out.println("No argument");
	}
	public void display(int a) {
		System.out.println("1 Argument");
	}
	public void display(int a,int b) {
		System.out.println("2 Argument");
	}
	public void display(int a,int b,int c) {
		System.out.println("3 Arguments");
	}
	public void dis(int a,double d) {
		System.out.println("Interchainging");
	}
	void displa(double d,int b) {
		System.out.println("interchainging int to float");
	}
}

public class method_overloading_eg {

	public static void main(String[] args) {
		
		Test1 ob=new Test1();
		ob.display();
		ob.display(1);
		ob.display(1, 1);
		ob.display(1, 1, 1);
		ob.dis(1, 1.2);
		ob.displa(1.1,2);
		
		
		
	}

}
