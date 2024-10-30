package Week5;

//Import all necessary packages here
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

 // create static method "convertStudentListToMap"
 public static Map<Integer, Student> convertStudentListToMap(List<Student> students){
     Map<Integer, Student> studentMap = students.stream() // Convert the list to a stream of Student objects
                                 .collect(Collectors.toMap( Student::getId, student -> student ));
     return studentMap; // Return the resulting Map
 }


 // Complete the main method
 public static void main(String[] args) {

     //Create an empty list of student objects
      List<Student> students = new ArrayList<>();
     
     //add student objects to this list
     students.add(new Student(1, "Alice", 20));
     students.add(new Student(2, "Bob", 22));
     students.add(new Student(3, "Charlie", 21));

     // Call "convertStudentListToMap" method and and store the results in studentMap
     Map<Integer, Student> studentMap = convertStudentListToMap(students);
     // Print the map
     System.out.println("Students Map: "+ studentMap);
 }
}

//Summary:
//This code convert a List of Student objects into a Map, 
//using the student ID as the key and the Student object as the value. 
//The program defines a Student class with its attributes and corresponding constructor, 
//along with getter methods to access the private variables. 
//I initially had difficulty to remind how to use the `collect` method and lambda expressions 
//in conjunction with the `toMap` method, but working with my team helped to undersatnd 
//and come up to the solution,I gained a clearer understanding. 
//In the future, I will remember the power of Java Streams for processing collections and 
//the importance of using method references for cleaner code.