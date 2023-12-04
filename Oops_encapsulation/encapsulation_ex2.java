package Oops_encapsulation;

class Student{
	private	String name;
	private String usn;
	private float percentage; 
	
	public Student(String name, String usn, float percentage) {
		this.name=name;
		this.usn=usn;
		this.percentage=percentage;
		
	}
	
	public String getUsn() {
		return usn;
	}
	public String getName() {
		return name;
	}
	public float getpercentage() {
		return percentage;
	}
	public void setUsn(String usn) {
		this.usn=usn;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPercentage(float percentage)
	{
		this.percentage=percentage;
	}	
	
	
	}
	
public class encapsulation_ex2 {

	public static void main(String[] args) {
		Student student=new Student("Faisal", "1HK19CS084", 85);
		student.getName();
		student.getUsn();
		student.getpercentage();
		
		System.out.println(student.getName()+student.getUsn()+student.getpercentage());
		
		student.setName("Faizan");
		student.setUsn("1HK19CS085");
		student.setPercentage(86);
		
		System.out.println("New Student Name is"+student.getName());
		System.out.println("New Student usn is"+student.getUsn());
		System.out.println("New Student percentage is"+student.getpercentage());

	}

}
