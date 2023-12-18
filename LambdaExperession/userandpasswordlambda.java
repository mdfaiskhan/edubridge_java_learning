package LambdaExperession;

import java.util.Scanner;

interface userandpass{
	String display(String user,String pass);
}
public class userandpasswordlambda {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		userandpass ob=(user,pass)->{
			System.out.println("Enter username : ");
			String user1=sc.next();
			System.out.println("Enter Password : ");
			String Password=sc.next();
			if(user1.equals("Faisal") && Password.equals("12345")) {
				System.out.println("Welcome Faisal Khan");
			}
			else {
				System.out.println("Either Wrong Username or WrongPassword");
			}
			
			return null;};
			ob.display("", "");

	}

}
