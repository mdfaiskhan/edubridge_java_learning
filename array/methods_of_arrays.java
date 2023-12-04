package array;

import java.util.Arrays;

public class methods_of_arrays {

	public static void main(String[] args) {
		//to find length of an array
		int x[]= {1,2,3};
		System.out.println("The Length of an array is "+x.length);
		
		//shallow copy 
		int a[] = {4,2,1,3,5};
		int y[] = a.clone();
		System.out.println(y);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(y));
		
		//array.sort()
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//Arrays.fill()
		int[] fai= new int[5];
		Arrays.fill(fai,4);
		System.out.println(Arrays.toString(fai));
		fai[0]=10;
		fai[1]=20;
		fai[2]=30;
		fai[3]=40;
		System.out.println(Arrays.toString(fai));
		
		
		//binary search
		int sal[]= {1,2,3,4,5,6};
		int index=Arrays.binarySearch(sal,2);
		System.out.println(index);
		
		//equals
		int moh[]= {1,2,3};
		int ahh[]= {1,2,3};
		boolean med=Arrays.equals(moh, ahh);
		
		//
		int[] originalArray = {1, 2, 3, 4, 5};

		// Creating a copy of the original array with a new length
		int newLength = 7;
		int[] copiedArray = Arrays.copyOf(originalArray, newLength);

		// Print the original and copied arrays
		System.out.println("Original array: " + Arrays.toString(originalArray));
		System.out.println("Copied array:   " + Arrays.toString(copiedArray));
	
		//length of the string
		String str[]= {"faisal","khan","abcd"};
		System.out.println("length of string is "+str.length);
		System.out.println("lenth of a object is "+str[1].length());
	}
		

		
		
		
	}


