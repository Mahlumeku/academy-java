package Week2;

public class MultipleCatchExample2 {
    public static void main(String[] args) {
        try {
            // Attempt to divide by zero (will cause ArithmeticException)
            int result = 10 / 0;
            System.out.println("Result: " + result);
            
            // Attempt to access an invalid index of the array (will cause ArrayIndexOutOfBoundsException)
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing 4th element: " + numbers[3]);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // Handle both types of exceptions
            System.out.println("Caught an exception: " + e.getClass().getSimpleName());
            System.out.println("Error message: " + e.getMessage());

        } finally {
            // This block will always execute, regardless of exception
            System.out.println("The 'finally' block is always executed.");
        }

        System.out.println("Program continues after handling the exceptions...");
    }
}
