package deadLock;

public class App5 {

	public static void main(String[]args) {
		final Runner r1 = new Runner();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					r1.stageone();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}	
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					r1.stagetwo();
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
			e.printStackTrace();
		}
		
		r1.finished();
	}
	
}
