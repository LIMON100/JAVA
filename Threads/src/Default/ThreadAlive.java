package Default;

public class ThreadAlive {

	public static void main(String[]args) throws InterruptedException
	{
		Thread t=new Thread(new Myrunnable());
		
		t.start();
		
		t.join();
		
		System.out.println(t.getName()+" Is ALive after join "+t.isAlive());
	}
}
