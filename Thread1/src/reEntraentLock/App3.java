package reEntraentLock;

public class App3 {

	public static void main(String[]args) {
		final RUnner run = new RUnner();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					run.firstthread();
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
					run.secondthread();
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
		
		run.finished();
	}
}
