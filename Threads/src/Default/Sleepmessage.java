package Default;

public class Sleepmessage {

	public static void main(String[]args) throws InterruptedException
	{
		String message[]= {"What is ur name", " How are u?", "When u wake up in the morning.","My name is limn"};
		
		for(String message1: message)
		{
			Thread.sleep(5000);
			System.out.println(message1);
		}
	}
}
