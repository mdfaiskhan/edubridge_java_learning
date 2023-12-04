package File_System;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writing_file {

	public static void main(String[] args) throws IOException {
		FileWriter ob1=new FileWriter("C:\\Users\\mdfai\\eclipse-workspace\\FirstCoreJavaProject\\src\\File_System\\File1.txt");
	    ob1.write("Java is object oriented programming");
	    System.out.println("Successfully Written");
	    ob1.close();

	}

}
