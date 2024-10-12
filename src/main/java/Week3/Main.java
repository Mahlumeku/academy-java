package Week3;

public class Main {
	public static void main(String[] args) {

		// Start by looking in the University and Student classes. Implement the
		// methods.

		// Create a bunch of student objects
		// (Make sure one student has the following studentId: 123)
		// (Make sure one other student has the following username: testUsername1)
		Student student1 = new Student(123, "testUsername1", "test", "User1", "student1@yahoo.com", "4351256",
				"QueenSt.", "M", 10 / 05 / 1996, 10 / 09 / 2024, 50060, "New");
		Student student2 = new Student(456, "testUsername2", "test2", "User2", "student2@yahoo.com", "4568974",
				"Markham.", "M", 10 / 05 / 1990, 10 / 09 / 2024, 50061, "New");
		Student student3 = new Student(789, "testUsername3", "test3", "User3", "student3@yahoo.com", "5678952",
				"Lawrance", "M", 10 / 05 / 1993, 10 / 09 / 2024, 50062, "New");
		Student student4 = new Student(101, "testUsername4", "test4", "User4", "student4@yahoo.com", "2354678",
				"QueenSt.", "M", 10 / 05 / 1995, 10 / 09 / 2024, 50063, "New");
		// Create instance of university called "university" and populate it with the
		// students.
		Univeristy university = new Univeristy();
		univeristy.addStudent(student1);
		univeristy.addStudent(student2);
		univeristy.addStudent(student3);
		univeristy.addStudent(student4);

		System.out.println("\nUniversity ------ \n" + university.students);
		System.out.println("\nGetting student------\n" + university.getStudent(123));
		System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
		System.out.println("\nSeaching student------\n" + university.searchStudent("testUserna"));

		System.out.println("\nUniversity ------ \n" + university.students);

	}
}
