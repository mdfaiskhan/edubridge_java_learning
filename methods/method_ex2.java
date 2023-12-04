package methods;

import java.util.Scanner;

public class method_ex2 {
	Scanner sc=new Scanner(System.in);
	public int choice(int a,int b,int c,int d) {
		System.out.println("Enter the choices"+a+" "+b+" "+c+" "+d);
		return a;
		}
	public int display(int a,int b){
		
		System.out.println("Addition of 2 numbers is "+ (a+b));
		return a+b;
		
	}
	public int sub(int a ,int b) {
		System.out.println("subtraction of 2 nos is "+ (a-b));
		return a-b;
	}
	public void mul(int a, int b) {
		System.out.println("the multiplication of 2 nos is "+ (a*b));
	}
	public int div(int a,int b) {
		System.out.println("The Division of 2 Numbers is "+ (a/b));
		return a/b;
	}
	public static void main(String[] args) {
		method_ex2 ob=new method_ex2();
		ob.display(10, 10);
		
		method_ex2 ob1=new method_ex2();
		ob.sub(10, 10);
		
		method_ex2 ob2=new method_ex2();
		ob.mul(10,10);
		
		method_ex2 ob3=new method_ex2();
		ob.div(10,10);

	}

}
