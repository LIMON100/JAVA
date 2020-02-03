package Default;

class Table
{
	static void printable(int n)
	{
		synchronized(Table.class)
		{
			System.out.println(Thread.currentThread().getName());
			
			for(int i=1;i <=5; i++)
			{
				System.out.println(n*i);
				
				try
				{
					Thread.sleep(500);
				}
			
				catch(Exception e)
				{
					
				}
			}
			System.out.println("......................");
		}
	}
}

public class StaticSynchronizationdemo {

	public static void main(String[]args)
	{
		Thread t1=new Thread()
		{
			public void run()
			{
				Table.printable(1);
			}
		};
		
		Thread t2=new Thread()
		{
			public void run()
			{
				Table.printable(10);
			}
		};
		
		t1.start();
		t2.start();
	}
}
