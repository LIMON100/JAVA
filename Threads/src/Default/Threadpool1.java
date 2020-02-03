package Default;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Test implements Runnable
{
	private String name;

	public Test(String s)
	{
		name=s;
	}
	
	@Override
	public void run() {
		try
		{
			for(int i=0; i<5; i++)
			{
				if(i==0)
				{
					Date d=new Date(i);
					SimpleDateFormat ft=new SimpleDateFormat("hh:mm:ss");
					System.out.println("Initialization Time for"+ " task name - "+ name +" = " +ft.format(d)); 
				}
				
				 else
	                { 
	                    Date d = new Date(i); 
	                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss"); 
	                    System.out.println("Executing Time for task name - "+ name +" = " +ft.format(d));
	                } 
				
				Thread.sleep(500);
			}
			System.out.println("Complete");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}


public class Threadpool1 {

	static final int MAX_T=3;
	
	public static void main(String[]args)
	{
		Runnable r1=new Test("Task-1");
		Runnable r2=new Test("Task-2");
		Runnable r3=new Test("Task-3");
		Runnable r4=new Test("Task-4");
		Runnable r5=new Test("Task-5");
		
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
		
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		
		pool.shutdown();
	}
}
