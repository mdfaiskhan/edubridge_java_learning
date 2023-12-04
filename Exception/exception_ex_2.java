package Exception;

public class exception_ex_2 {

	public static void main(String[] args) {
		//null pointer exception
		//String str=null;
		//int num=str.length();
		//System.out.println("Null Pointer Exception");
		//System.out.println(num);
		
		//number format exception
		//String str1="hello";
		//int num1=Integer.parseInt(str1);
		//System.out.println(num);
		
		//Array Index out of bound exception
		int a[]= {1,2,3,4};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println("Array Index out of bound exception");
		System.out.println(a[4]);

	}

}
