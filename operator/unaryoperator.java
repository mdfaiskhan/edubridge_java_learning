package operator;
//unary operator
public class unaryoperator {
	
	public static void main(String args[]) {
		int x=10;
		int y=++x;//pre increment
		System.out.println(x);
		
		int a=12;
		int b=a++;//post increment
		System.out.println(a);
		System.out.println(b);
		
		int c=12;
		int d=c--;//post decrement
		System.out.println(c);
		System.out.println(d);
		
		int e=12;
		int f=--e;//pre decrement
		System.out.println(e);
		System.out.println(f);
	}

}
