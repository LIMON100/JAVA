package producer_consumer;

import java.util.Scanner;

public class JoinNotify {

	public void producer() throws InterruptedException{
		synchronized(this){
			System.out.println("Thread is staritng..........");
			wait();
			System.out.println("Resumed");
		}
	}
	
	public void consumer() throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		Thread.sleep(1000);
		
		synchronized(this){
			System.out.println("Waiting for the key pressed");
			scan.nextLine();
			System.out.println("Pressed any key to resumed");
			notify();
		}
	}
}
