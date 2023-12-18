package LambdaExperession;
interface square{
	int display(int n);
}
public class Lambda1argument {

	public static void main(String[] args) {
		square ob=(n)->{return n*n;};
		System.out.println("Square of the Number is "+ob.display(4));
	}

}
