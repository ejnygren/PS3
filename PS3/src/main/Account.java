package main;

import java.util.Date;
import java.io.*;

public class Account {
	//Assigns the int id the default of 0
	private int id = 0;
	
    //Assigns the double balance the default of 0
	private double balance = 0.0;
    
	//Assigns the double annualInterestRate the default of 0
	private double annualInterestRate = 0.0;
	
    //Assigns dateCreated to the Date datatype
	private Date dateCreated;
    
	//Getter for dateCreated
	public Date getDateCreated() {
		return dateCreated;
	}
    
	//Getter for id
	public int getId() {
		return id;
	}
    
	//Setter for id
	public void setId(int id) {
		this.id = id;
	}

	//Getter for balance
	public double getBalance() {
		return balance;
	}
    
	//Setter for balance
	public void setBalance(double balance) {
		this.balance = balance;
	}
    
	//Getter for annualInterestRate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
    
	//Setter for annualInterestRate
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
    
	//Constructor that creates the account with the specified id, balance, and annual interest rate
	Account(int specifiedId, double specifiedBalance, double specifiedAnnualInterestRate) {
		id = specifiedId;
		balance = specifiedBalance;
		annualInterestRate = specifiedAnnualInterestRate;
		dateCreated = new java.util.Date();
	}

	//No-arg constructor that creates a default Account
	Account() {

	}
    
	//Method to compute Monthly interest rate
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	//Method to withdraw from balance
	public void withdraw(double amount) throws InsufficientFunds {
		if(amount <= balance){
			
		balance = (getBalance() - amount);
		}
		else {
			
			double needs = amount - balance;
			
			throw new InsufficientFunds(needs);
			
		}
	}

	//Method to deposit into balance
	public void deposit(double amount) {
		balance = (getBalance() + amount);
	}

}
