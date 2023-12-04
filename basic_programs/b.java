public class Calculator {
    // Method to add two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Method with no return value (void)
    public void displayMessage(String message) {
        System.out.println("Message: " + message);
    }

    // Static method (can be called on the class itself)
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
}

public class b {
    public static void main(String[] args) {
        // Creating an instance of the Calculator class
        Calculator myCalculator = new Calculator();

        // Calling instance methods
        int sum = myCalculator.add(5, 3);
        System.out.println("Sum: " + sum);

        int difference = myCalculator.subtract(8, 4);
        System.out.println("Difference: " + difference);

        myCalculator.displayMessage("Hello, Java!");

        // Calling a static method
        int product = Calculator.multiply(6, 7);
        System.out.println("Product: " + product);
    }
}
