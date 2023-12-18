package LambdaExperession;


interface Faisal1{
	void display();
}
class child implements Faisal1{

	@Override
	public void display() {
		System.out.println("Hello World");		
	}
	
}
public class comparingwithnormalinterface {

	public static void main(String[] args) {
		child ob=new child();
		ob.display();

	}

}
