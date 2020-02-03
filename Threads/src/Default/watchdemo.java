package Default;

public class watchdemo {

	public static void main(String[]args) throws InterruptedException
	{
		Thread watched=new Thread(new SHutDwn());
		watched.start();
		
		Thread.sleep(500);
		watched.interrupt();
	}
}
