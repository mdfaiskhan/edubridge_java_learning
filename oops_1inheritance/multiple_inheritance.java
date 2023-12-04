package oops_1inheritance;

interface Parent1{
	public void parent1properties();
}
interface Parent2{
	public void parent2properties();	
}
class Child10 implements Parent1,Parent2 {

	@Override
	public void parent2properties() {
		System.out.println("Acquiring Parent 2 properties from Parent 2");
		
	}

	@Override
	public void parent1properties() {
		System.out.println("Acquiring properties from Parent 1");
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
		
	}}
public class multiple_inheritance {

	public static void main(String[] args) {
		Child10 ob=new Child10();
		ob.parent1properties();
		ob.parent2properties();

	}

}
