package semaPhores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App7 {

	public static void main(String[]args) {
		
		ExecutorService ex = Executors.newCachedThreadPool();
		
		for(int i=1; i<=100; i++) {
			ex.submit(new Runnable() {

				public void run() {
					COnnection.getInstance().connect();	
				}
				
			});
		}
		
		ex.shutdown();
		try {
			ex.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
