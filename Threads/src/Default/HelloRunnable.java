package Default;

public class HelloRunnable implements Runnable {

	public static void main(String[]args)
	{
		HelloRunnable helorunable=new HelloRunnable();
		Thread thread=new Thread(helorunable);
		thread.start();
		
	}

	@Override
	public void run() {
		System.out.println("HEllo My Run.");
		
	}
}
