package com.edu;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String name=sc.nextLine();
		System.out.println("My Name is : "+name);
		System.out.println("Enter your age : ");
		int age=sc.nextInt();
		System.out.println("My age is "+age);
		System.out.println("Enter your Score: ");
		float percentage=sc.nextFloat();
		System.out.println(percentage);
		}
	}

}
