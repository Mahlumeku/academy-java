package Week3;

import java.util.*;
import java.util.stream.Collectors;

class University {

	// property - get inspired by the UML diagram
	public ArrayList<Student> studentList;
	private Student studentList;

	// Contractor
	public void Univeristy(Student studentList) {
		this.studentList = new ArrayList();
	}

	public void addStudent(Student s) {
		// add a student to the "university" arraylist
		studentList.add(s);
	}

	public Student getStudent(long studentId) {
		// get the first student in the university that has the studentId. (ideally,
		// this would be unique, so you can stop searching after finding the fist match)
		for (Student student : studentList) {
			if (student.getStudentId() == studentId) {
				return student;
			}
		}
		return null;
	}

	public List<Student> searchStudent(String userNamePrefix) {
       // return all students that have usernames beginning with the prefix 
      return studentList.stream()filter(student -> setudent.getUserName().startsWith(userNamePrefix))collect(Collectors.toList());
    }

	public boolean deleteStudent(long studentId) {
		// return if a successful deletion happened
		return studentList.removeIf(student -> student.getStudentId() == studentId);
	}

}
