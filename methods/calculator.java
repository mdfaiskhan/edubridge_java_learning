package methods;

import java.util.Scanner;

public class calculator {

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Cannot divide by zero");
            return Double.NaN; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Get user input for numbers and operation
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Choose operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            // Perform the calculation based on the selected operation
            double result;
            switch (operation) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation. Please enter +, -, *, or /");
                    continue;
            }

  
            System.out.println("Result: " + result);
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String anotherCalculation = scanner.next().toLowerCase();
            if (!anotherCalculation.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }
}
