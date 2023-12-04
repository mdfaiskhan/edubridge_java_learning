package operator;

public class aissgnment_operator {
public static void main(String args[]) {
	int a=10;
	int b=20;

	b += a; //addition
	System.out.println(b);
	int c=(b -= a); //subtraction
	System.out.println(c);
	int d=(b *= a);//multiplication
	System.out.println(d);
	int e=(b /= a);//division
	System.out.println(e);
}
}
