package operator;

import java.util.Scanner;

public class conditional_operator2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 5 numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	int e=sc.nextInt();
	int max;
	max=(a>b && a>c && a>d && a>e)? a :
		(b>a && b>c && b>d && b>e)? b :
		(c>a && c>b && c>d && c>e)? c :
		(d>a && d>b && d>c && d>e)? d : e;
	System.out.println("The maximum number is"+max);
	}

}
