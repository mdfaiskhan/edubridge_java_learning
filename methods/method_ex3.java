package methods;

public class method_ex3 {
	
	public int display(int b,int h) {
		double area=0.5*b*h;
		System.out.println("the area of rectangle is "+ area);
		return b;
	}

	public static void main(String[] args) {
	 method_ex3 ob=new method_ex3();
	 ob.display(2, 2);

	}

}
