package oops_1inheritance;

class Animals{
	public void eat() {
		System.out.println("ANIMAL IS EATING...");
	}
}
interface swimmer{
	public void swim();
}
interface flyer{
	public void fly();
}

class Bird extends Animals implements flyer{

	
	public void fly() {
		System.out.println("Birds can fly");
		System.out.println("////////////////////////////////////");
		}}
class Fish extends Animals implements swimmer{

	@Override
	public void swim() {
		System.out.println("Fish can Swim");
		System.out.println("//////////////////////////////////////////");
		
	}
	
}

class FlyerFish extends Animals implements swimmer,flyer{

	@Override
	public void fly() {
		System.out.println("Flyer Fish can Fly");
		
	}

	@Override
	public void swim() {
		System.out.println("FlyerFish can Swim");
		System.out.println("//////////////////////////////////");
		
		
	}}

public class hybrid_inheritance {

	public static void main(String[] args) {
		Bird ob=new Bird();
		ob.eat();
		ob.fly();
		
		Fish ob1=new Fish();
		ob1.eat();
		ob1.swim();
		
		FlyerFish ob2=new FlyerFish();
		ob2.eat();
		ob2.fly();
		ob2.swim();
		}

}
