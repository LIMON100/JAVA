package Default;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class SHutDwn implements Runnable{

	private boolean running=true;
	private static final DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:s a");
	
	@Override
	public void run() {
		while(running)
		{
			printCurrentTime();
			///sleepOneSecond();
		}
	}
	
	private void printCurrentTime()
	{
		String formattedCurrentTime=LocalDateTime.now().format(formatter);
	}
	
	/*private void sleepOneSecond()
	{
		try
		{
			Thread.sleep(TimeUnit.SECONDS.toMillis(1));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[]args) throws InterruptedException
	{
		SHutDwn shut=new SHutDwn();
		
		Thread t1=new Thread(new SHutDwn());
		t1.start();
		
		Thread.sleep(5000);
		SHutDwn.shutdown();
	}

	private static void shutdown() {
		
	}*/
}
