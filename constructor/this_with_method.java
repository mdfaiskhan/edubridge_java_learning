package constructor;

class text{
	public void display() {
		System.out.println("first method");
	}
	public void display1() {
		this.display();
		System.out.println("Second Method");
	}
}
public class this_with_method {
public static void main(String[] args) {
		text ob=new text();
		ob.display1();
	}

}

