package polymorphism;

class AAAA{
	public void display(int a,float b) {
		System.out.println("Int-FLoat Type");
	}
	public void display(float a,int b) {
		System.out.println("FLoat-Int Type");
	}
}
public class case_4 {

	public static void main(String[] args) {
		AAAA ob=new AAAA();
		ob.display(1, 5.4f);
		ob.display(0.1f, 10);
		//ob.display(10, 10);
		//ob.display((int) 1.02f, 10.3f);
	}

}
