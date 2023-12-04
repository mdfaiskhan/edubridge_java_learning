package com.edu;
/*implicit casting and explicit casting definiton
 * In Java, casting refers to the process of converting a value of one data type to another. There are two types of casting: implicit casting (also known as widening or automatic casting) and explicit casting (also known as narrowing or manual casting).

1. **Implicit Casting:**
   - Implicit casting occurs automatically when a smaller data type is promoted to a larger data type.
   - This is considered safe because there is no loss of information during the conversion.
   - For example, converting an `int` to a `long` or a `float` to a `double` is an implicit casting.

   ```java
   int intValue = 10;
   long longValue = intValue; // Implicit casting from int to long
   ```

   In the example above, the `intValue` is implicitly cast to a `long` when assigned to the `longValue`.

2. **Explicit Casting:**
   - Explicit casting is required when converting a larger data type to a smaller data type.
   - This type of casting needs to be done manually and may result in loss of information if the value being cast cannot be represented in the smaller data type.
   - To perform explicit casting, you use parentheses and specify the target data type.

   ```java
   double doubleValue = 10.5;
   int intValue = (int) doubleValue; // Explicit casting from double to int
   ```

   In the example above, the `doubleValue` is explicitly cast to an `int`. Note that the fractional part is truncated, and there may be a loss of precision.

It's important to be cautious when using explicit casting, as it can lead to data loss or unexpected behavior if not done carefully. Additionally, when casting between incompatible types, you should ensure that the value being cast is within the valid range of the target type to prevent overflow or underflow issues.
 */
public class typecastingdemo {

	public static void main(String[] args) {
		int a=100;
		long b=a;
		System.out.println("Implicit type casting is "+b);
		
		byte c=12;
		int d=c;
		System.out.println("Implicit type casting is "+d);
		
		long e=12345;
		float f=e;
		System.out.println("Implicit type casting is "+f);
		
		float g=1234.555f;
		double h=g;
		System.out.println("implcit type casting is "+h);
		
		byte i=3;
		short j=i;
		System.out.println("Implicit type casting is "+j);
		
		//Explicit programming big datatype to smaller datatype
		
		double k=2000000;
		float l=(float)k;
		System.out.println("explicit type casting is "+l);
		
		float m=456.789f;
		long n=(long)m;
		System.out.println("Explicit type casting is "+n);
		
		long o=12345;
		int p=(int)o;
		System.out.println("Explicit type casting is "+p);
		
		int q=100;
		char r=(char)q;
		System.out.println("Explicit type casting is "+r);
		
		char s=123;
		byte t=(byte)s;
		System.out.println("Explicit type casting is "+t);
	}

}
