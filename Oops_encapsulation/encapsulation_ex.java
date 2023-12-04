package Oops_encapsulation;

public class encapsulation_ex {
    // Private variable to store data
    private int myData;

    // Public method to set the value of myData
    public void setMyData(int newData) {
        // You can add validation logic here if needed
        myData = newData;
    }

    // Public method to get the value of myData
    public int getMyData() {
        return myData;
    }

    public static void main(String[] args) {
        // Create an instance of the class
    	encapsulation_ex obj = new encapsulation_ex();

        // Set the value using the public method
        obj.setMyData(42);

        // Get the value using the public method and print it
        System.out.println("The value of myData is: " + obj.getMyData());
    }
}
