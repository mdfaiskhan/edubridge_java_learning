package constructor;

import java.util.ArrayList;
import java.util.List;

class Car {
    String make;
    String model;
    int year;

    // Parameterized constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

public class CarList {
    public static void main(String[] args) {
        // Create a list to store cars
        List<Car> carList = new ArrayList<>();

        // Add cars to the list using the constructor
        carList.add(new Car("Toyota", "Camry", 2022));
        carList.add(new Car("Honda", "Accord", 2021));
        carList.add(new Car("Ford", "Mustang", 2023));

        // Display the list of cars
        System.out.println("List of Cars:");
        for (Car car : carList) {
            System.out.println(car);
        }
    }
}

