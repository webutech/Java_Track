package threadmethods;

class BankService{
	double balance=5000;
	int flag=0;
	
	public synchronized double withdraw(final double amount){
		String threadName=Thread.currentThread().getName();
		System.out.println("==============="+threadName+": withdraw Started=================");
		System.out.println(threadName+" is going to withdraw");
		if(flag==0){
			try{
				System.out.println("Waiting.......");
				wait();
			}catch(Exception ex){
				ex.printStackTrace();
			}
			
		}
		System.out.println("Available balance in "+threadName+" 's Account : "+balance);
		balance=balance-amount;
		System.out.println(threadName+" has withdrawn :"+amount);
		System.out.println("Remaining balance in "+threadName+" 's Account : "+balance);
		System.out.println("==============="+threadName+": withdraw End=================");
		return balance;
	}
	
	public synchronized void deposite(final double amount){
		String threadName=Thread.currentThread().getName();
		System.out.println("==============="+threadName+": deposite Started=================");
		System.out.println(threadName+" is going to deposite");
		
	}
}
public class InterThreadCommDemo {

	public static void main(String[] args) {
		

	}

}
