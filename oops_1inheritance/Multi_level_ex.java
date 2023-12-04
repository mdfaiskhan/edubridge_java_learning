package oops_1inheritance;

class GrandParent {
	public void grandparent() {
		System.out.println("GrandParent");
	}
}
class Parent extends GrandParent{
	public void parent() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	public void child() {
		System.out.println("Child");
	}
}

public class Multi_level_ex {

	public static void main(String[] args) {
		//GrandParent ob=new GrandParent();
		//ob.grandparent();
		
		//Parent ob1=new Parent();
		//ob1.grandparent();
		//ob1.grandparent();
		
		Child ob2=new Child();
		ob2.grandparent();
		ob2.parent();
		ob2.child();
	}

}
