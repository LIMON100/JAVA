package cOUNTLathces;

import java.util.concurrent.CountDownLatch;

public class QTeam extends Thread{
	
	private CountDownLatch latch;
	
	public QTeam(String name) {
		super(name);
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
		
		
	}
	
}
