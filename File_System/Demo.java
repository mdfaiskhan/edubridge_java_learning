package File_System;
//1. creating  a file\
//2. get the information of the file 

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		File ob=new File("CoreJava.pdf");
		if(ob.createNewFile()) {
			System.out.println("Successfully Created");
		}
		else {
			System.out.println("File exists");
		}
	}

}
