package Week2;

public class Car2 {
    // Class variables
    private String color;
    private String brand;
    private int price;

    // Parameterized constructor
   Car2(String color, String brand, int price) {
        this.color = color; // Assign constructor parameters to class variables
        this.brand = brand;
        this.price = price;
    }

    // Default constructor
    public Car2() {
        this("Unknown", "Unknown", 0); // Call parameterized constructor with default values
    }

    // Method to print car details
    public void printCarDetails() {
        System.out.println("Car Details: " + color + " " + brand + " $" + price);
    }
}