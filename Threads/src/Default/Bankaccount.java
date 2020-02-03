package Default;

public class Bankaccount {

	private int amount=10000;
	
	synchronized void withdraw(int amount) throws InterruptedException
	{
		System.out.println("Going to withdraw");
		
		if(this.amount < amount)
		{
			System.out.println("Less amount.Wait..........");
			
			wait();
			
			this.amount-=amount;
			
			System.out.println("Withdraw completed.");
		}
	}
	
	synchronized void deposit(int amount)
	{
		System.out.println("Going to deposit...");
		this.amount+=amount;
		System.out.println("Deposit completed..");
		notify();
	}
}


