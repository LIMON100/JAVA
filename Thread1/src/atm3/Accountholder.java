package atm3;

import atm1.Account;

public class Accountholder implements Runnable{

	private Account account;

	public Accountholder(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=4; i++) {
			makewithdrawal(1500);
			
			if(account.getBalance() < 0) {
				System.out.println("Not sufficient balance for withdraw........");
			}
		}
	}
	
	public synchronized void makewithdrawal(int amount) {
		if(account.getBalance() > amount) {
			System.out.println(Thread.currentThread().getName() +" is going to withdraw money."+amount);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			account.withdraw(amount);
		}
		
		else {
			System.out.println("Not enough money for withdrawing.."+account.getBalance());
		}
	}
	
}
