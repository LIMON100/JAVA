package Default;

public class Myrunnable implements Runnable{

	@Override
	public void run() {
		Thread t=Thread.currentThread();
		
		System.out.println(t.getName()+ " Is-Alive= "+t.isAlive());
		
	}

	
}
