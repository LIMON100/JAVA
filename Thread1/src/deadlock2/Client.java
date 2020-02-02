package deadlock2;

public class Client {

	public static void main(String[]args) {
		Object lock1 = new Object();
		Object lock2 = new Object();
		
		Mythread1 m1 = new Mythread1(lock1,lock2);
		Mythread2 m2 = new Mythread2(lock1,lock2);
		
		Thread t1 = new Thread(m1,"TA");
		Thread t2 = new Thread(m2,"TB");
		
		t1.start();
		t2.start();
	}
}
