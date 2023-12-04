package operator;

import java.util.Scanner;

public class arithmeticoperator {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first number");
	int a=sc.nextInt();
	System.out.println("Enter the Second Number");
	int b=sc.nextInt();
	
	int c = a+b;
	int d = a-b;
	int e = a*b;
	int f = a/b;
	System.out.println("The Addition of 2 Numbers is "+c);
	System.out.println("The Addition of 2 Numbers is "+d);
	System.out.println("The Addition of 2 Numbers is "+e);
	System.out.println("The Addition of 2 Numbers is "+f);
	
}
}
