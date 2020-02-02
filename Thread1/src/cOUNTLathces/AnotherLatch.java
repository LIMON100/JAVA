package cOUNTLathces;

import java.util.concurrent.CountDownLatch;

public class AnotherLatch {
	
	public static void main(String[] args) {
		
		CountDownLatch latch = new CountDownLatch(2);
		
		DevTeam team1 = new DevTeam(latch,"Dev-1");
		DevTeam team2 = new DevTeam(latch,"Dev-2");
		
		team1.start();
		team2.start();
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		QTeam t1 = new QTeam("Dev-3");
		t1.start();
	}
}
