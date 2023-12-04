package methods;

import java.util.Scanner;

public class method_ex4 {
	
	public double display() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("Enter your choice");
		int c=sc.nextInt();
		
		switch(c) {
		
		case 1:
			System.out.println(n1+n2);
			break;
		case 2:
			System.out.println(n1-n2);
			break;
		case 3:
			System.out.println(n1*n2);
			break;
		case 4:
			System.out.println(n1/n2);
			break;
		
		
		}
		
		return 0;
		
	}

	public static void main(String[] args) {
		method_ex4 a=new method_ex4();
		a.display();

	}

}
