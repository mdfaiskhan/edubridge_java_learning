package oops_1inheritance;

//Grandparent class
class Employee {
 String name;
 int employeeId;

 Employee(String name, int employeeId) {
     this.name = name;
     this.employeeId = employeeId;
 }

 void displayInfo() {
     System.out.println("Employee ID: " + employeeId);
     System.out.println("Name: " + name);
 }
}

//Parent class inheriting from Employee
class Manager extends Employee {
 String department;

 Manager(String name, int employeeId, String department) {
     super(name, employeeId);
     this.department = department;
 }

 void displayInfo() {
     super.displayInfo();
     System.out.println("Department: " + department);
 }

 void manageTeam() {
     System.out.println("Manager is managing the team");
 }
}

//Child class inheriting from Manager
class TeamLead extends Manager {
 int teamSize;

 TeamLead(String name, int employeeId, String department, int teamSize) {
     super(name, employeeId, department);
     this.teamSize = teamSize;
 }

 void displayInfo() {
     super.displayInfo();
     System.out.println("Team Size: " + teamSize);
 }

 void leadTeam() {
     System.out.println("TeamLead is leading the team");
 }
}

public class multi_level_ex2 {
 public static void main(String[] args) {
     // Creating an object of the child class (TeamLead)
     TeamLead teamLead = new TeamLead("John Doe", 101, "Engineering", 8);

     // Using methods from the grandparent class (Employee)
     teamLead.displayInfo();

     // Using methods from the parent class (Manager)
     teamLead.manageTeam();

     // Using methods from the child class (TeamLead)
     teamLead.leadTeam();
 }
}

