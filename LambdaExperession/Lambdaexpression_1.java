package LambdaExperession;
//Lambda Expression
@FunctionalInterface
interface Faisal{
	void display();
}

public class Lambdaexpression_1 {

	public static void main(String[] args) {
		Faisal ob=()->{System.out.println("Hello World");};
		ob.display();

}
}

