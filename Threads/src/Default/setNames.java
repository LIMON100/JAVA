package Default;

public class setNames extends Thread{

	public static void main(String[]args)
	{
		setNames n1=new setNames();
		setNames n2=new setNames();
		
		System.out.println("Before starting thread.");
		System.out.println("First Name: "+n1.getName());
		System.out.println("Second Name: "+n2.getName());
		
		n1.start();
		n2.start();
		
		n1.setName("setName1");
		n2.setName("setName2");
		
		System.out.println("After starting thread.");
		System.out.println("First Name: "+n1.getName());
		System.out.println("Second Name: "+n2.getName());
	}
	
	public void run()
	{
		System.out.println("HI");
	}
}
