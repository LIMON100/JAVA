package Default;

public class RunnableTask implements Runnable{

	private String tasknumber;
	
	public RunnableTask(String tasknumber)
	{
		this.tasknumber=tasknumber;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "Start.tasknumber= "+tasknumber);
		try {
			processcommand();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "End of task= "+tasknumber);
	}

	void processcommand() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	
	public String toString()
	{
		return this.tasknumber;
	}
}
