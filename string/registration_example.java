package string;
//registration process
import java.util.Scanner;

public class registration_example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Username");
		String a=sc.next();
		System.out.println("Enter the Password :");
		String b=sc.next();
		//compares if the username and password is correct
		if(a.equalsIgnoreCase("faisal") && b.equalsIgnoreCase("FAISAL"))
		{
			System.out.println("Login successful");
		}else {
			System.out.println("Unsuccessful");
		}
		

	}

}
