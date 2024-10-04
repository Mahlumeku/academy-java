package Fridayex;

public class Main {

	public static void main(String[] args) {
		
		Triangle object = new Triangle();
		Rectangle obj2 = new Rectangle();

		int a = 7;
        int b = 10;
        int c = 35;
        int d = 8;


        int perimeter = object.perimeterCalculator(a,b,c);
        int area = object.areaCalculator(7,10);
        int perimeter2 = obj2.parimeterCalculatorRec(a,b,c,d);

        System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);
        System.out.println("Parimeter of the rectangle is: "+ perimeter2);


	}

}
