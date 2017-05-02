package customexception;

public class BankServie {
	
	private double balance=5000;
	
	public void withdraw(final int accNo, final double amount) throws InvalidAccountNumberException, 
	InsufficientBalanceException{
		
		if(accNo!=101){
			throw new InvalidAccountNumberException("Your Account Number is not valid");
		}
		else if(amount>5000){
			throw new InsufficientBalanceException("Your amount is greater than available balance");
			
		}
		
		else{
				System.out.println("Current balance : "+balance);
				balance=balance-amount;
				System.out.println("Available balance : "+balance);
				System.out.println("Amount withdrawn : "+amount);
				System.out.println("Amount withdrawn from  : "+accNo +" account number");
		}
	}
}
