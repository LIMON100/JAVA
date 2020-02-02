package deadLock;

public class Account {

	private int amount = 1000;
	
	public void deposit(int balance) {
		amount+=balance;
	}
	
	public void withdraw(int balance) {
		amount-=balance;
	}
	
	public int money() {
		return amount;
	}
	
	public static void transfer(Account ac1,Account ac2,int balance) {
		ac1.deposit(balance);
		ac2.withdraw(balance);
	}
}
