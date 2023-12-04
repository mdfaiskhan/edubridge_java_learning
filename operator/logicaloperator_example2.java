package operator;

import java.util.Scanner;

public class logicaloperator_example2 {
public static void main(String args[]) {
	int x=10;
	int y=11;
	if(++x>10 && ++y>13)
	{
	System.out.println(++x);
}
	else {
		System.out.println(++y);
	}
}
}
