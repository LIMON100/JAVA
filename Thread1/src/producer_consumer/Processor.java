package producer_consumer;

public class Processor {

	public static void main(String[]args) {
		
		final JoinNotify joinnotify  = new JoinNotify();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					joinnotify.producer();
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
					joinnotify.consumer();
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
