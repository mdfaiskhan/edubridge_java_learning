package operator;

public class assignment_operator2 {
	public static void main(String args[]) {
	int	a=10;
	int b=10;
	b = a;
	System.out.println(b);
	
	b &= a;
	System.out.println(b);
	
	b |=a;
	System.out.println(b);
	
	b >>=a ;
	System.out.println(b);
	
	b <<=a;
	System.out.println(b);
	}

}
