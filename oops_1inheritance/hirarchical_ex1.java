package oops_1inheritance;

class Feroz{
	public void feroz() {
		System.out.println("This is Father");
	}
}
class Faisal extends Feroz {
	public void faisal() {
		System.out.println("This is Child 1");
	}
}
class Najma extends Feroz {
	public void najma() {
		System.out.println("This is Child2");
	}
}

public class hirarchical_ex1 {

	public static void main(String[] args) {
		//Feroz ob=new Feroz();
		//ob.feroz();
		
		Faisal ob1=new Faisal();
		ob1.faisal();
		ob1.feroz();
		
		Najma ob2=new Najma();
		ob2.najma();
		ob2.feroz();

	}

}
