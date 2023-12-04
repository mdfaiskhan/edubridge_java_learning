package oops_1inheritance;

//Parent class
class parent {
public void parents() {
     System.out.println("Father - hi son");
     System.out.println("////////////////////////////////////////////");
 }
}
class child extends parent {
 public void childs() {
     System.out.println("son-hi dad");
 }
}

public class single_level {
 public static void main(String[] args) {
    
     child myDog = new child();

     myDog.parents();
     myDog.childs();
 }
}
