package Week2;

public class TryCatchExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Attempt to access an invalid index of the array
            System.out.println("Accessing the " + numbers[5] +"th element: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the case where the index is out of bounds
            System.out.println("Caught an ArrayIndexOutOfBoundsException: Index is out of bounds.");
        } finally {
            // This block will always execute, regardless of exception
            System.out.println("The 'finally' block is always executed.");
        }

        System.out.println("Program continues after handling the exception...");
    }
}
