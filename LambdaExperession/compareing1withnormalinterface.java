package LambdaExperession;

interface square1{
	int display(int n);
}
class child1 implements square1{
	@Override
	public int display(int n) {	
		return n*n;		
	}	
}
public class compareing1withnormalinterface {
	public static void main(String[] args) {
		child1 ob=new child1();
		System.out.println("Square is "+ob.display(3));
	}
}
