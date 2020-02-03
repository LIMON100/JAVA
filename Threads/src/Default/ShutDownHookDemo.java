package Default;

public class ShutDownHookDemo {

	public static void main(String[]argd)
	{
		Runtime runtime=Runtime.getRuntime();
		
		runtime.addShutdownHook(new ShutDownthread());
		
		System.out.println("Now system is sleeping....press ctrl+c to terminate.");
		
		try
		{
			Thread.sleep(5000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
