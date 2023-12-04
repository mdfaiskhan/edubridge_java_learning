package iterative_statement;

import java.util.Scanner;

public class do_while_ex {

	public static void main(String[] args) {
		// example_1
		//int x=1;
		//do {
			//System.out.println("This is Iteration"+x);
			//x++;
			//}
		//while(x<=10);
		//example_2
		//int x=2;
		//do {
		//	System.out.println(x);
		//	x=x+2;
		//}
		//while(x<=20);
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>=1) {
			System.out.println("number is posiitve");
		} else {
			System.out.println("number is negative");
		}
		
		
	}

}
