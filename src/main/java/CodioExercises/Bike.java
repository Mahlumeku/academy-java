package CodioExercises;

public class Bike extends Vehicle {
    
    //Step 3a: Declare String bikeHandle
    private String bikeHandle;
    
    //Step 3b: Define parameterized constructor for color, brand, bikeHandle
    public Bike(String color, String brand, String bikeHandle){
        super(color, brand); //call parent class constractor
        this.bikeHandle = bikeHandle;
    }

    //Step 3c: Create a print() method as per the specification in the above
    @Override
    public void print(){
        super.print();//call parent class print method
     }

}