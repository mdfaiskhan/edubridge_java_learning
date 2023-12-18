package LambdaExperession;

interface add{
	int display(int a,int b);
}
class childadd implements add{

	@Override
	public int display(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}

public class comparing2withnormalinterface {

	public static void main(String[] args) {
		childadd ob=new childadd();
		System.out.println(ob.display(2, 3));

	}

}
