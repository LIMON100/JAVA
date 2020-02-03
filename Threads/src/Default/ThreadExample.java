package Default;

public class ThreadExample {

	public static void main(String[]args)
	{
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0; i<10; i++)
		{
			new Thread("" +i)
			{
				public void run()
				{
					try
					{
						Thread.sleep(1000);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
					
					System.out.println("Thread: "+ getName() +"Running");
				}
			}.start();
		}
	}
}
