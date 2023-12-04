package com.edu;

import java.util.Scanner;

public class calculator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Calculator");
		System.out.println();
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		int div=num1/num2;
		
		System.out.println("the addition of 2 nos are " + sum);
		System.out.println("the subtraction of 2 nos are " + sub);
		System.out.println("the Multiplication of 2 nos are " + mul);
		System.out.println("the Division of 2 nos are " + div);
		
		
		
		
		
	}

}
