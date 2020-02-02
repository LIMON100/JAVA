package reEntraentLock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class RUnner {
	
	private Lock lock = new ReentrantLock();
	private int count = 0;
	private Condition cond = lock.newCondition();
	
	private void increment() {
		for(int i=1; i<=1000; i++) {
			count++;
		}
	}

	public void firstthread() throws InterruptedException{
		lock.lock();
		System.out.println("Waiting...");
		
		cond.await();
		System.out.println("Unlocked");
		
		try {
			increment();
		}finally {
			lock.unlock();
		}
	}
	
	public void secondthread() throws InterruptedException{
		Thread.sleep(500);
		lock.lock();
		
		System.out.println("Press any key to continue");
		new Scanner(System.in).nextLine();
		System.out.println("Nothing i want to say");
		
		cond.signal();
		
		try {
			increment();
		}finally {
			lock.unlock();
		}
	}
	
	public void finished() {
		System.out.println("Total count: "+count);
	}
}
