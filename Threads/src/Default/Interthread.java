package Default;

public class Interthread {

	public static void main(String[]args)
	{
		final Bankaccount bank=new Bankaccount();
		
		new Thread("Thread-1")
		{
			public void run()
			{
				try {
					bank.withdraw(50000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		
		new Thread("Thread-2")
		{
			public void run()
			{
				bank.deposit(80000);
			}
		}.start();
	}
}
