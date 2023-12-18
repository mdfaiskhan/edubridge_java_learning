package LambdaExperession;

interface addition{
	int display(int a,int b);
}


public class lambd2arguments {

	public static void main(String[] args) {
	addition ob=(a,b)->{return a-b; };
	System.out.println("Addition of 2 and 5 numbers is "+ob.display(2, 5));
	//System.out.println("subtraction of 5 and 2 is"+ob.display(5, 2));
	}

}
