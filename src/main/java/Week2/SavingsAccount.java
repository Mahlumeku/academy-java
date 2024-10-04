package Week2;

public class SavingsAccount extends Account {
	   
    //declare instance variable
    private double interestRate;
    //add parameterized constructor - use super keyword to call parent constructor
    public SavingsAccount(String name, double balance, double interestRate){
        super(name,balance);
        this.interestRate = interestRate;
    }
    //override the toString method
    @Override
    public String toString(){
        return super.toString() + ", " + interestRate;
    }

    //override the equals method
    @Override
    public boolean equals(Object obj){

        if(this == obj) return true;
        if(!(obj instanceof SavingsAccount)) return false;

        SavingsAccount other = (SavingsAccount) obj;
        return super.equals(other) && this.interestRate == other.interestRate;
    }

    
}