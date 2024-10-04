package Week2;

public class UncheckedException2 {
    public static void main(String[] args) {
        String str = null; // This will cause a NullPointerException

        try {
            // Attempting to call a method on a null object
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            // This block will execute
            System.out.println("Error: Attempted to access a method on a null object.");
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
