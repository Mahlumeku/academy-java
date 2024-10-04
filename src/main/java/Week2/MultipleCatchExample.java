package Week2;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            // Attempt to divide by zero (will cause ArithmeticException)
            int result = 10 / 2;
            System.out.println("Result: " + result);
            
            // Attempt to access an invalid index of the array (will cause ArrayIndexOutOfBoundsException)
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing 4th element: " + numbers[3]);

        } catch (ArithmeticException e) {
            // Handle division by zero error
            System.out.println("Caught an ArithmeticException: Cannot divide by zero.");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle array index out of bounds error
            System.out.println("Caught an ArrayIndexOutOfBoundsException: Invalid index.");
            
        } finally {
            // This block will always execute, regardless of exception
            System.out.println("The 'finally' block is always executed.");
        }

        System.out.println("Program continues after handling the exceptions...");
    }
}
