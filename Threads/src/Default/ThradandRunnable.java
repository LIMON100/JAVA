package Default;

public class ThradandRunnable {

	public static void main(String[]args)
	{
		mythread obj=new mythread();
		obj.run();
	}
	
}

class mythread extends Thread
{
	///@Override
	public void run() {
		for(int i=1; i<=10; i++)
		{
			System.out.println(1);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}