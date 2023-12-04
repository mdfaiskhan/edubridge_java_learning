package constructor;
class b{
	int rollno=123;
	String name="faisal";
	b(){
		System.out.println("no arg const");
	}
	public b(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	
	}
public class const_2 {
	public static void main(String args[]) {
	b ob=new b();
	b ob1=new b(123,"faisal");
	System.out.println(ob1.rollno+" "+ob1.name);
	}
}
