package oops_1inheritance;


class Vehicle {
 public void start() {
     System.out.println("Vehicle is starting");
 }

 public void stop() {
     System.out.println("Vehicle is stopping");
     System.out.println("///////////////////////////////////");
 }
}


class Car extends Vehicle {
 public void accelerate() {
     System.out.println("Car is accelerating");
 }
}

public class Inheritance_Example2 {
 public static void main(String[] args) {
   
     Car myCar = new Car();

   
     myCar.start();
     myCar.stop();


     myCar.accelerate();
 }
}

