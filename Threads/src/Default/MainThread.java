package Default;

public class MainThread {

	public static void main(String[]args)
	{
		Thread thread=Thread.currentThread();
		thread.setName("LIMON");
		System.out.println("Name of the thread: "+thread);
		
	}
}
