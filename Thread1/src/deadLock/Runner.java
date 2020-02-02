package deadLock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Runner {
	
	private Account a1 = new Account();
	private Account a2 = new Account();
	
	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	
	private void acquirelock(Lock firstlock, Lock secondlock) throws InterruptedException{
		
		while(true) {
			boolean gotfirstlock = false;
			boolean gotsecondlock = false;
			
			try {
				gotfirstlock = firstlock.tryLock();
				gotsecondlock = secondlock.tryLock();
			}
			finally {
				
				if(gotfirstlock && gotsecondlock) {
					return;
				}
				
				if(gotfirstlock) {
					firstlock.unlock();
				}
				
				if(gotsecondlock) {
					secondlock.unlock();
				}
			}
			
			Thread.sleep(1);
		}
		
	}

	public void stageone() throws InterruptedException{
		Random random = new Random();
		for(int i=1; i<=1000; i++) {
			
			acquirelock(lock1,lock2);
			
			try {
				Account.transfer(a1, a2, random.nextInt(100));
			}finally {
				lock1.unlock();
				lock2.unlock();
			}
		}
		
	}
	
	public void stagetwo() throws InterruptedException{
		Random random = new Random();
		
		for(int i=1; i<=1000; i++) {
			
			acquirelock(lock2,lock1);
			
			try {
				Account.transfer(a2, a1, random.nextInt(100));
			}finally {
				lock1.unlock();
				lock2.unlock();
			}
		}
	}
	
	public void finished() {
		System.out.println("Account one: "+a1.money());
		System.out.println("Account two: "+a2.money());
		System.out.println("Total Balance: "+(a1.money()+a2.money()));
	}
	
}
