package demo3;

import java.util.Scanner;

class processor extends Thread{
	private volatile boolean running = true;
	
	public void run() {
		while(running) {
			System.out.println("Hello");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown() {
		running = false;
	}
}

public class voltile {

	public static void main(String[]args) {
		processor process = new processor();
		process.start();
		
		System.out.println("Press return to stop.......");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		
		process.shutdown();
		
	}
}
