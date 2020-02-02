package demo1;

class Runner extends Thread {

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Hello = "+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class App {

	public static void main(String[]args) {
		Runner runer1 = new Runner();
		runer1.start();
	}
}
