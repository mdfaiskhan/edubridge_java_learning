package File_System;

import java.io.File;

public class get_information {

	public static void main(String[] args) {
		File ob=new File("Java.txt");
		if(ob.exists()) {
			System.out.println("The File Path is : "+ob.getAbsolutePath());
			System.out.println("The Name of the File is : "+ob.getName());
			System.out.println("Can we read from The File ? : "+ob.canRead());
			System.out.println("Can we Wrtie in the File? : "+ob.canWrite());
		}
		else {
			System.out.println("File doesnt exist");
		}

	}

}
