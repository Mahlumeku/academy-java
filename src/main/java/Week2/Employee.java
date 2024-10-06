package Week2;

public class Employee {
		   // Instance variable to store salary
		   private int salary;
		   private double hoursPerDay;
		   // Instance variable to store hours per day worked by employee
		   public void setSalary(int salary){
		      //increse the salary by 10 if it is less than 500
		      if(salary < 500){
		         this.salary = salary + 10;
		      }else{
		         this.salary = salary; //remain unchanged if the slary is 500 or more
		      }
		   }
		   public void setHoursPerDay(int hoursPerDay){
		      this.hoursPerDay = hoursPerDay;
		      if(hoursPerDay > 6){
		         this.salary += 5; //Increase salary by 5
		      }
		   }
		   public int getSalary(){
		      return salary;
		   }
		   // Constructor to set instance variables(salary and hoursPerDay) value
		   public Employee(int salary, int hoursPerDay){
		      setSalary(salary);
		      setHoursPerDay(hoursPerDay);
		   }
		   // Set method to update salary
		   // Set method to update hoursPerDay
		   // Get method to return salary
		}

