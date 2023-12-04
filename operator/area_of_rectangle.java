package operator;

import java.util.Scanner;

public class area_of_rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Lenght");
		double l=sc.nextDouble();
		System.out.println("enter the Breath of the Rectangle");
		double b=sc.nextDouble();
		double area=l*b;
		System.out.println("the area of rectangle is"+area);
		
	}

}
