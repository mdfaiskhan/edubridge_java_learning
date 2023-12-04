package oops_1inheritance;
class Employeee{
	public void employee(int id,String name) {
		id=001;
		name="Faisal";
		System.out.println("Employee ID is "+id);
		System.out.println("Employee name is "+name);
		System.out.println("//////////////////////////////////");
	}
}
class Manageer extends Employeee {
	public void manager(String name,String Position){
		name = "Mohammed";
		Position="High";
		System.out.println("The name of the Manager is "+name);
		System.out.println("The Position of the Manager is "+Position);
		System.out.println("////////////////////////////////////////////");
	}
}

class BranchManager extends Manageer{
	public void BranchManager(String name,String area) {
		name="Abcd";
		area="Jaynagar";
		System.out.println("The Name of Branch Manager is "+name);
		System.out.println("The Area which Branch Manager Manages is "+area);
	}
}

public class multi_level_ex3 {

	public static void main(String[] args) {
		//Employee ob=new Employee();
		//ob.employee(1, "nua");
		
		BranchManager ob2=new BranchManager();
		ob2.employee(2, "aa");
		ob2.manager("aa", "aa");
		ob2.BranchManager("hh", "aa");
		

	}

}
