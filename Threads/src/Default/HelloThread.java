package Default;

public class HelloThread extends Thread{
	public static void main(String[]args)
	{
		HelloThread thread=new HelloThread();
		thread.start();
	}
	
	@Override
	public void run()
	{
		System.out.println("MY RUN THREAD.");
	}

}
