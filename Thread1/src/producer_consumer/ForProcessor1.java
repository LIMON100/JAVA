package producer_consumer;

public class ForProcessor1 {

	public static void main(String[] args) {
		
		Processor1 pros = new Processor1();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pros.producer1();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pros.consumer1();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
