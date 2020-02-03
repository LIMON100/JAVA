package Default;

public class Daemonthread extends Thread {

	public Daemonthread(String name)
	{
		super(name);
	}
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(getName() + " is Daemon thread");
		}
		
		else
		{
			System.out.println(getName() + " is Non-Daemon thread");
		}
	}
	
	public static void main(String[]args)
	{
		Daemonthread t1=new Daemonthread("Thread-1");
		Daemonthread t2=new Daemonthread("Thread-1");
		Daemonthread t3=new Daemonthread("Thread-1");
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
