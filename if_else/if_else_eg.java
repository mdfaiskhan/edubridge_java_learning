package if_else;

import java.util.Scanner;

public class if_else_eg {

	public static void main(String[] args) {
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("The Number is Even");
		}
		else {
			System.out.println("The Number is odd");
			
		}
		}
	}

}
