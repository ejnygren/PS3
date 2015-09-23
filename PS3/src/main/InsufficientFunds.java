package main;

@SuppressWarnings("serial")
public class InsufficientFunds extends Exception {
	
    private double amount;
	   
	public InsufficientFunds(double amount)
	{
    this.amount = amount;
	} 
	   
	public double getAmount(){
		
	    return amount;
	}

}
