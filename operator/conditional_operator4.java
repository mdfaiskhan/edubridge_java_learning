package operator;

import java.util.Scanner;

public class conditional_operator4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 4 Numbers to find the Minimum Number");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		double min;
		min=(a<b && a<c && a<d)? a:
			(b<a && b<c && b<d)? b:
			(c<a && c<b && c<d)? c:d;
		System.out.println("The Minimum Number between the four numbers is "+min);
		
	}

}
