package assignment_shoppingcart;

import java.util.Scanner;

public class shopping_cart {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number of products");
	 double product=sc.nextDouble();
	 System.out.println("Enter the price of 1st quantity");
	 double one=sc.nextDouble();
	 System.out.println("Enter the price of 2nd quantity");
	 double two=sc.nextDouble();
	 System.out.println("Enter the price of 3rd quantity");
	 double three=sc.nextDouble();
	 System.out.println("Enter the price of 4th quantity");
	 double four=sc.nextDouble();
	 System.out.println("Enter the price of 5th quantity");
	 double five=sc.nextDouble();
	 double six=one+two+three+four+five;
	 System.out.println("The Price for"+product+" "+"is "+six);
	 double dis=0.1*six;
	 System.out.println("The DIscounted Price is "+dis);
	 double discount= six-dis;
	 System.out.println("The Discounted Amlunt is "+discount);
	 double tax=discount-0.18*discount;
	 System.out.println("The Amount of Tax detuction is "+tax);
	}

}
