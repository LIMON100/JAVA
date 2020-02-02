package producer_consumer;

import java.util.LinkedList;
import java.util.Random;

public class Processor1 {
	
	private LinkedList<Integer> list1 = new LinkedList<Integer>();
	private final int limit = 10;
	private Object lock = new Object();

	public void producer1() throws InterruptedException {
		int value = 0;
		
		while(true) {
			
			synchronized(lock) {
				while(list1.size() == limit) {
					lock.wait();
				}
				
				list1.add(value++);
				lock.notify();
			}
		}
	}
	
	public void consumer1() throws InterruptedException {
		
		Random random = new Random();
		
		while(true) {
			synchronized(lock) {
				
				while(list1.size() == 0) {
					lock.wait();
				}
				
				System.out.print("List size is: "+list1.size());
				int value = list1.removeFirst();
				System.out.println(", value is: "+value);
				lock.notify();
			}
			
			Thread.sleep(random.nextInt(1000));
		}
		
	}
}
