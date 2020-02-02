package atm2;

import atm1.Account;
import atm3.Accountholder;

public class Clientserver {

	public static void main(String[]args) {
		Account ac1 = new Account();
		Accountholder ach = new Accountholder(ac1);
		
		Thread t1 = new Thread(ach);
		Thread t2 = new Thread(ach);
		
		t1.setName("Limon");
		t2.setName("Nion");
		
		t1.start();
		t2.start();
		
	}
	
}
