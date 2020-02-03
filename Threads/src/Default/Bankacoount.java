package Default;

public class Bankacoount {

	private int acuntnumbner;
	private double acuntbalance;
	
	private AccountDAO dao;
	
	public synchronized boolean deposit(double amount)
	{
		double newaccountBalance;
		
		acuntbalance=dao.getCurrentAccountBalance(acuntnumbner);
		
		if(amount<0.0f)
		{
			return false;
		}
		
		else
		{
			newaccountBalance=acuntbalance+amount;
			dao.updateCurrentAccountBalance(newaccountBalance);
			return true;
		}
		
	}
}
