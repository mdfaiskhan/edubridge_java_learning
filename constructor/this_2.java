package constructor;

class qwerty{
	qwerty(){
		String name="Faisal";
		double rollno=123;
		double std=12;
		String address="jp nagar , bengaluru";
		System.out.println("The name of the student is "+name);
		System.out.println("The rollno of the Student if "+rollno);
		System.out.println("The class of the student is "+std);
		System.out.println("The Address of the Student is "+address);	
		System.out.println("********************************************");
	}
	qwerty(String cname,String cadd ){
		this();
		cname="HKBK College of engineering";
		cadd="nagwara, Bengaluru";
		System.out.println("Name of the college is"+cname);
		System.out.println("Address of the College is "+cadd);
		
	}
}

public class this_2 {

	public static void main(String[] args) {
		qwerty ob=new qwerty("HKBK","bengaluru");
	}

}
