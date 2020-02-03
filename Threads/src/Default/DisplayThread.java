package Default;

public class DisplayThread extends Thread{

	private String msg;
	private DisplayMessage displaymessage;
	
	public DisplayThread(DisplayMessage displaymessage,String msg)
	{
		this.displaymessage=displaymessage;
		this.msg=msg;
	}
	
	public void run()
	{
		displaymessage.showmessage(msg);
	}
}
