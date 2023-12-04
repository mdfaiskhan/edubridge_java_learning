package operator;
// to fijd minimum number using conditional operator
public class condotiona_operator3 {
public static void main(String args[]) {
	int a=10;
	int b=2;
	int c=30;
	int min;
	min=(a<b && a<c)? a:
		(b<a && b<c)? b:c;
	System.out.println(min);
}
}
