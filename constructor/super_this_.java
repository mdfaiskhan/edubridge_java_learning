package constructor;

class Za{
			Za(){
		System.out.println("No arg Constructor");
	}
			Za(int a,int b){
		this();
		System.out.println("Parameterize constructor");
	}
}

public class super_this_ {
		public static void main(String args[]) {
			//Za ob=new Za();
			Za ob1=new Za(10,10);
		}
}

