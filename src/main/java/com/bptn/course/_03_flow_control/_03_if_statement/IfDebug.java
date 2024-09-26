package com.bptn.course._03_flow_control._03_if_statement;

public class IfDebug {
	
		   public static void main(String[] args) {
		     int score = 93;
		     String grade = "";

		     if (score >= 90) {
		         grade = "A";
		     } 
		     else if (score >= 80) {
		         grade = "B";
		     }
		     else if (score >= 70) {
		        grade = "C";
		     }
		     else if (score >= 60) {
		         grade = "D";
		     } else {
		       grade = "F";
		     }
		     
		     System.out.println(grade);
		   }

}
