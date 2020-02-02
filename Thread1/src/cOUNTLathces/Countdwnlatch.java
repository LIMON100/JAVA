package cOUNTLathces;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class processor implements Runnable{

	private CountDownLatch latch;
	
	public processor(CountDownLatch latch) {
		this.latch = latch;
	}
	
	public void run() {
		System.out.println("Started........");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		latch.countDown();
	}
	
}

public class Countdwnlatch {

	public static void main(String []args) {
		
		CountDownLatch countDownLatch = new CountDownLatch(3);
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i=1; i<=5; i++) {
			executor.submit(new processor(countDownLatch));
		}
		
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Completed.....");
	}
}
