package Week2;


public class Car { 
    private String color;
    private String brand; 
    private int price; 
    
    Car(String color,String brand,int price){
        this.color = color; 
        this.brand = brand; 
        this.price = price; 
    } 
    
   public void printCarDetails() { 
      System.out.println("Car Color: " + color);
      System.out.println("Car brand: " + brand); 
      System.out.println("Car price: " + price);
    }

 
  public static void main(String args[]) {
        Car car1 = new Car("white", "BMW", 70000);                                
        car1.printCarDetails();
   }
}