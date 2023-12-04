package OOPs_Abstraction;

abstract class fruit{
	abstract void taste();
}
class Mango extends fruit{

	void taste() {
		System.out.println("Tastes Sweet");
	}
	
}
public class abstracttion {

	public static void main(String[] args) {
		Mango ob=new Mango();
		ob.taste();

	}

}
