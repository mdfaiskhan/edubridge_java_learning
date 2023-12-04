package Oops_encapsulation;

import java.util.Scanner;

class Bankaccount1{
	private double balance;
	
	public Bankaccount1(double initialbalance) {
		this.balance=initialbalance;
	}
	public double getbalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposited: Rs."+amount);
		}
		else {
			System.out.println("Invalid Deposit Amount");
		}
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
		balance-=amount;
		System.out.println("withdraw: Rs."+amount);
		}
		else {
			System.out.println("insufficient Balance");
		}
	}
}

public class banking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the Balance");
		//double balance=sc.nextDouble();
		Bankaccount1 ob=new Bankaccount1(1000);
		
		System.out.println("Initial Balance: Rs."+ob.getbalance());
		
		ob.deposit(500);
		
		System.out.println("Updated Balance after Deposit: Rs."+ob.getbalance());
		
		ob.withdraw(500);
		
		System.out.println("Updates Baalnce after withdraw: Rs."+ob.getbalance());
		
		
		
	}

}
