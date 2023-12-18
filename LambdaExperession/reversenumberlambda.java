package LambdaExperession;

interface reverse{
	int display(int a);
}
public class reversenumberlambda {

	public static void main(String[] args) {
		reverse ob=(a)->{
			int reversed=0;
			while(a!=0) {
			int lastdigit=a % 10;
			reversed=reversed*10+lastdigit;
			a=a/10;
			}
			return reversed;
		};
		System.out.println("The Reversed Number is "+ob.display(12345));
	}

}
