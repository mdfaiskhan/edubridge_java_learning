package if_else;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date of this month");
		int a=sc.nextInt();
		switch(a) {
		case 1,8,15,22,29:
			System.out.println("Today's day is Sunday");
		break;
		case 2,9,16,23,30:
			System.out.println("Today's day is Monday");
		break;
	
		case 3,10,17,24:
			System.out.println("Today's day is Tuesday");
		break;
		case 4,11,18,25:
			System.out.println("Today's day is Wednesday");
		break;
		case 5,12,19,26:
			System.out.println("Today's day is Thrusday");
		break;
		case 6,13,20,27:
			System.out.println("Today's day is Friday");
		break;
		case 7,14,21,28:
			System.out.println("Today's day is Saturday");
		break;
		default:
			System.out.println("idiot this month only has 30 days");
			}
	}
	
	}
