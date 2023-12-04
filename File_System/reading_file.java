package File_System;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class reading_file {

	public static void main(String[] args) throws IOException {
		File ob=new File("File1.txt");
		Scanner sc = new Scanner(ob);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}
