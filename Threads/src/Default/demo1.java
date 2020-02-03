package Default;

public class demo1
{
	public static void main(String[]args)
	{
		Thread t=new Thread(new MyrunState());
		t.start();
		
	}
}
