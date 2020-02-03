package Default;

public class Interruupingdemo1 extends Thread{

	public static void main(String[]args)
	{
		Interruupingdemo1 t1=new Interruupingdemo1();
		t1.start();
		
		try
		{
			t1.interrupt();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void run()
	{
		try
		{
			System.out.println("Going to sleep.......");
			Thread.sleep(1000);
			System.out.println("Welcone to Bangladesh.......");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
