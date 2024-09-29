package com.bptn.course._02_scanner;

import java.util.Scanner;

class StringOperations {
    public static void main(String[] args) {
      //To allow user input
     Scanner scanner = new Scanner(System.in);
     int choice; //To store the user choice

     do {

      System.out.println("/...String Menu.../");
      System.out.println("Press 1 for Palindrome Check");
      System.out.println("Press 2 to reverse a String");
      System.out.println("Press 3 to Concatenate two Strings");
      System.out.println("Press 4 for String Comparison");
      System.out.println("Press 5 to Calculate the Length of String");
      System.out.println("Press 0 to Exit");

    // Get the user input for the choise of operation

      System.out.println("Enter the option: ");
      choice = scanner.nextInt();
      scanner.nextLine();  

    // use if- else statement to perform the opration based on user choise
    if( choice == 1){
      //Palindrome Check
      System.out.print("Enter a string: ");
      String str = scanner.nextLine();
      String reversedStr = new StringBuilder(str).reverse().toString(); // storing the reverse version in reversedStr
      //After reverse the string check it is palindrome or not
      if (str.equals(reversedStr)){
        System.out.println(reversedStr + " is a palindrome.");
      } else{
        System.out.println(reversedStr + " is not a palindrome");
      }
    }else if (choice == 2){
      //Reverse a string
      System.out.print("Enter a String ");
      String str = scanner.nextLine();
      String reversedStr = new StringBuilder(str).reverse().toString(); // storing the reverse version in reversedStr
      System.out.println("The reversed string is: " + reversedStr);
    } else if (choice == 3){
      //Concatenate Two Strings
      System.out.print("Enter the first string: ");
      String str1 = scanner.nextLine();
      System.out.print("Enter the secound string: ");
      String str2 = scanner.nextLine();
      String concatenateStr = str1 + str2;
      System.out.println(concatenateStr);

    }else if (choice == 4) {
      //String Comparison
      System.out.print("Enter the first string: ");
      String str1 = scanner.nextLine();
      System.out.print("Enter the secound string: ");
      String str2 = scanner.nextLine();

      if (str1.equals(str2)) {
        System.out.println("The entered strings are equal.");
      } else {
        System.out.println("The entered strings are not equal.");
      }
    }else if (choice == 5) {
      //calculate the length of a string
      System.out.print("Enter a string:");
      String str = scanner.nextLine();
      int length = str.length();
      System.out.println("The length of the entered is: " + length);
    } else if (choice == 0){
      //Exit the program
      System.out.println("Exiting the program.");
    } else{
      //Invalid choice
      System.out.println("Invalid choice please make a valid choice");
    }
      
     } while (choice !=0); // continue the loop until the user chooses to exit(choice 0)
    //Close the scanner
    scanner.close();
    }
}
