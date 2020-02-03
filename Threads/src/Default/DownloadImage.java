package Default;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import org.omg.CORBA.portable.InputStream;

class DownloadingHeart extends Thread
{
	private volatile boolean beating=true;
	@Override
	public void run()
	{
		String[] dots= {
				".","..","...","...."
		};
		
		while(beating)
		{
			for(String dot: dots)
			{
				System.out.println(dot);
			}
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown()
	{
		this.beating=false;
	}
}

class FileDownloader extends Thread
{
	private String url;
	private String filename;
	
	public FileDownloader(String url,String filename)
	{
		this.url=url;
		this.filename=filename;
	}
	
	@Override
	public void run()
	{
		try
		{
			System.out.println("Started to download: "+filename);
			URL resourceTodownload=new URL(url);
			URLConnection connection=resourceTodownload.openConnection();
			
			InputStream input=(InputStream) connection.getInputStream();
			
			File fileTosave=new File(filename);
			Files.copy(input, fileTosave.toPath(),StandardCopyOption.REPLACE_EXISTING);
			
			input.close();
		}
		catch(IOException e)
		{
			System.err.println("Failed to download the file: "+e.getMessage());
		}
	}
}

public class DownloadImage {
	public static void main(String[] args) throws InterruptedException
	{
		FileDownloader dl1=new FileDownloader("https://goo.gl/nqZJn4","jugbd-meetuo7_1.jpeg");
		FileDownloader dl2=new FileDownloader("https://goo.gl/UoSMMt","jugbd-meetuo7_2.jpeg");
		
		DownloadingHeart heartbeat=new DownloadingHeart();
		
		dl1.start();
		dl2.start();
		heartbeat.start();
		
		try
		{
			dl1.join();
			dl2.join();
			
			heartbeat.shutdown();
			heartbeat.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("\nThe download is complete.");
		
	}
}
