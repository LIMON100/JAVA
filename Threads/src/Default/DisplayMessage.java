package Default;

public class DisplayMessage {

	public synchronized void showmessage(String msg)
	{
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		System.out.print("["+msg);
		
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println	("]");
	}
}
