package semaPhores;

import java.util.concurrent.Semaphore;

public class COnnection {

	private static COnnection instance = new COnnection();
	private int connection = 0;
	
	private Semaphore sem = new Semaphore(10);
	
	public static COnnection getInstance() {
		return instance;
	}
	
	public void connect() {
		try {
			sem.acquire();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			donconnect();
		}
		finally {
			sem.release();
		}
	}
	
	public void donconnect() {
		
		synchronized(this) {
			connection++;
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized(this){
			connection--;
		}
	}
	
}
