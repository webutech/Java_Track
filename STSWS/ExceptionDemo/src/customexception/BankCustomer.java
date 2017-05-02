package customexception;

public class BankCustomer {

	public static void main(String[] args) {
		BankServie bankServie=new BankServie();
		try {
			bankServie.withdraw(100, 20000);
		} catch (InsufficientBalanceException | InvalidAccountNumberException e) {
			System.out.println("Error : "+e.getMessage());
		}
	}
}
