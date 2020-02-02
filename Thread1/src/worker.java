import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

import demo4.Synchronize;


public class worker {

	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	public Random random = new Random();
	
	
	private ArrayList<Integer> list1=new ArrayList<Integer>();
	private ArrayList<Integer> list2=new ArrayList<Integer>();

	public void onestage() {
		synchronized(lock1){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}
	}
	
	public void twostage() {
		synchronized(lock2){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));
		}
	}
		
	public void process() {
		for(int i=1; i<=1000; i++) {
			onestage();
			twostage();
		}
	}
	
	public void main() {
		System.out.println("Starting..................");
		
		long start = System.currentTimeMillis();
		
		Thread t1 = new Thread(new Runnable(){
            public void run() {
                 process();
            }
           
        });
        
         Thread t2 = new Thread(new Runnable(){
            public void run() {
                 process();
            }
           
        });
        
         t1.start();
         t2.start();
		
         try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
         
         long end = System.currentTimeMillis();
         
		System.out.println("Time: "+(end-start));
		
		System.out.println("List1: "+list1.size()+", List2: "+list2.size());
	}
	
}
