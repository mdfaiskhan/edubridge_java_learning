package variables;

public class instancevariable {
	int a;//0
    float b;//0.0
    String s; //null
    double f;
    String name="Faisal";
    String department="Cse";
    int age=20;
    String mail="mdfaiskhan@gmail.com";
    String address="jp nagar, Bengaluru";
    String number="8618331688";
    
	public static void main(String[] args) {
		
		instancevariable ob= new instancevariable();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.s);
		System.out.println(ob.f);
		System.out.println("Your Name is "+ob.name);
		System.out.println("Your Department is "+ob.department);
		System.out.println("Your Age is "+ob.age);
		System.out.println("Yuor Mail is "+ob.mail);
		System.out.println("Your address is "+ob.address);
		System.out.println("Your Number is "+ob.number);
	    

	}

}
