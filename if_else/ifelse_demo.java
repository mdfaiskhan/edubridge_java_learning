package if_else;

import java.util.Scanner;

public class ifelse_demo {

	public static void main(String[] args) {
		int a=10;
		if(a==0) {
			System.out.println("hello");
		}
		else {
			
			System.out.println("hi");
			
	    boolean q=true;
	    if(q==true) {
	    	System.out.println("hello");
	    } else
	    	System.out.println("hi");
		}
		//grade example
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks:");
		double grade=sc.nextDouble();
		if(grade>=90&&grade==100) {
			System.out.println("Distinction");
		}
		else if(grade>=101){
			System.out.println("error");
			}
		else if(grade>=80&&grade<=89) {
			System.out.println("Brilliant Marks");
		}
		else if(grade>=70&&grade<=79) {
			System.out.println("Very good Marks");
		}
		else if(grade>=60&&grade<=69) {
			System.out.println("Good Marks");
		}
		else if(grade>=50&&grade<=59) {
			System.out.println("Average Marks");
		}
		else {
			System.out.println("Fail Marks");
		}

	}

}
