package constructor;

class Faiz{
	int score;
	int updated_score=90;
	Faiz(){
		System.out.println("My Current Score is "+this.score);
	}
		Faiz(int a,int b){
			this();
			System.out.println("My Updated Score is "+this.updated_score);
		}
	}


public class this_super2 {

	public static void main(String[] args) {
		Faiz on=new Faiz(10,10);
	}

}
