package Week5;

public class Student {

	// Instance variables int id, String name, and int age
	private int id;
	private String name;
	private int age;

	// Constractor to initilize Student object with id,name and age
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// Getter method for id to access the private id variable
	public int getId() {
		return id; // Return the id of the student
	}

	// Getter method for name to access the private name variable
	public String getName() {
		return name; // Return the name of the student
	}

	// Getter method for age to access the private age variable
	public int getAge() {
		return age; // Return the age of the student
	}

	// Override toString for easy display Student objects
	// toString() method
	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}'; // Return the string
																							// representation of the
																							// student object
	}
}
