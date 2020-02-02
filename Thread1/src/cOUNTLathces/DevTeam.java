package cOUNTLathces;

import java.util.concurrent.CountDownLatch;

public class DevTeam extends Thread{

	private CountDownLatch latch;
	
	public DevTeam(CountDownLatch latch,String name) {
		super();
		this.latch = latch;
	}
	
	@Override
	public void run() {	
		
		System.out.println("Task assigned to the development team: "+Thread.currentThread().getName());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Task completed for the team: "+Thread.currentThread().getName());
		
		latch.countDown();
		
	}
	
}
