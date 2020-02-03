package Default;

public class SYnchronizationdemo1 {

	public static void main(String args[])
	{
		DisplayMessage displaymessage=new DisplayMessage();
		
		DisplayThread t1=new DisplayThread(displaymessage,"Welcome");
		DisplayThread t2=new DisplayThread(displaymessage,"Hello");
		DisplayThread t3=new DisplayThread(displaymessage,"Peter");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
