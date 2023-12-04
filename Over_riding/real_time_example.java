package Over_riding;

class Home_loan {
	void loan_amount(){
		System.out.println("The Home Loan Amount is : Rs.50,00,000");
	}
	void loan_interest() {
		System.out.println("The Interest for Home Loan Amount is : 8%");
	}
}
class Homeloan extends Home_loan{
	void loan_interest() {
		System.out.println("The Interest for Home Loan Amount is : 10%");
	}
}
public class real_time_example {

	public static void main(String[] args) {
		//Home_loan ob=new Home_loan();
		//ob.loan_amount();
		//ob.loan_interest();
		//Homeloan ob1=new Homeloan();
		//ob.loan_amount();
		//ob.loan_interest();
		Home_loan ob2=new Homeloan();
		ob2.loan_amount();
		ob2.loan_interest();
		

	}

}
