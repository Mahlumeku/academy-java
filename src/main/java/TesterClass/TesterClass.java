package TesterClass;

public class TesterClass {  
    // main method for testing
    public static void main(String[] args) {
        Student s1 = new Student("Skyler", "skyler@sky.com", 123456);
        System.out.println("Name: " +  s1.getName());

        // Fix the bug here! fixed!!
        System.out.println("Email: " +  s1.getEmail());
        System.out.println("ID: " + s1.getId() );
    }
}