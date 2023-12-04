package if_else;

import java.util.Scanner;
public class is_else_positive {
	public static void main(String[] args) {		
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		double a=sc.nextDouble();		
		if(a>=0) {
			System.out.println("the number is positive")			
		}
		else if(a<0) {
			System.out.println("The Number is Negative");			
		}
		else {
			System.out.println("invalid number");
			
		}		
		}
	}

}
