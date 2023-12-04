package operator;

import java.util.Scanner;

public class shiftoperator {
public static void main(String arge[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int a=sc.nextInt();
	System.out.println("Enter the Number to be compared");
	int c=sc.nextInt();
	int b=a<<c;
	int d=a>>c;
	System.out.println(b);
	System.out.println(d);
}
}
