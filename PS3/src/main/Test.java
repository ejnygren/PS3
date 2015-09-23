package main;

public class Test {
	
	public static void main(String[] args){
		
		Account accountObject = new Account(1122,20000, 4.5);
		System.out.printf("The balance is: $%5.2f ",accountObject.getBalance());
		System.out.println("The monthly interest is: " + accountObject.getMonthlyInterestRate() + " %");
		System.out.println("The date the account was created is: " + accountObject.getDateCreated());
		accountObject.deposit(3000);
		System.out.println("Your balance is: $" + accountObject.getBalance());
		try {
			System.out.println("Withdrawing $2,500");
			accountObject.withdraw(2500);
			System.out.println("Balance is now $" + accountObject.getBalance());
			System.out.println("Withdrawing $20,501");
			accountObject.withdraw(20501);
		}catch(InsufficientFunds e)
		{
			System.out.println("Sorry, but you are short $" + e.getAmount());
			
			e.printStackTrace();
		}
		
		
	}

}
