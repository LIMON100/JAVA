package Default;

public class MyrunState implements Runnable
{

	@Override
	public void run() {
		Thread.State state=Thread.currentThread().getState();
		System.out.print("Thread name: "+Thread.currentThread().getName());
		System.out.println(" , state="+state);	
	}
	
}