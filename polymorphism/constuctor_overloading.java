package polymorphism;
//overloading in constructor
class Faisal{
	Faisal(){
		System.out.println("0 Argument");
	}
	Faisal(String Name){
		this();
		System.out.println("Name: Faisal");
	}
	Faisal(String Name,double rollno){
		this(Name);
		System.out.println("Name:Faisal  rollno:122  ");
	}
	Faisal(String Name,double rollno,double number){
		this(Name,rollno);
		System.out.println("Name:Faisal  rollno:122  number:8618331688 ");
	}
	Faisal(String Name,double rollno,double number,String Department){
		this(Name,rollno,number);
		System.out.println("Name:Faisal  rollno:122  number:8618331688 Department:Cse");
	}
	
}


public class constuctor_overloading {

	public static void main(String[] args) {
		//Faisal ob=new Faisal();
		//Faisal ob1=new Faisal("F");
		//Faisal ob2=new Faisal("F",1);
		//Faisal ob3=new Faisal("F",1,8);
		Faisal ob4=new Faisal("F",1,8,"c");
		
		
	}

}
