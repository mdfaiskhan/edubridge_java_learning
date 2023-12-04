package File_System;
//creating the file
import java.io.File;
import java.io.IOException;

public class creating_file {

	public static void main(String[] args) throws IOException {
		File ob=new File("C:\\Users\\mdfai\\eclipse-workspace\\FirstCoreJavaProject\\src\\File_System\\File1.txt");
		if(ob.createNewFile()) {
			System.out.println("Sucessfully Created");
			
		}
		else 
		{
			System.out.println("FIle already exists");
		}
	}

}
