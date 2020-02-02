import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.logging.Handler;

public class Game extends Canvas implements Runnable{

	private static final long serialVersionUID=1L;
	private boolean isrunning=false;
	private Thread thread;
	
    private Handle hand;
    private BufferedImage level = null;
	
	public Game()
	{
		new window(1000,563,"WIzard Game",this);
		start();
		
		hand=new Handle();
		this.addKeyListener(new KeyInput(hand));
		
		BufferedImageLoader loader = new BufferedImageLoader();
		level = loader.LoadImage("/Level.png");
		
		///-hand.addObject(new Wizard(400,400,ID.player,hand));
		
		///LoadLevel(level);
	}
	
	private void start()
	{
		isrunning=true;
		thread=new Thread(this);
		thread.start();
	}
	  
	private void stop()
	{
		isrunning=false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void run()
	{
		this.requestFocus();
		long lastTime=System.nanoTime();
		double amountOfTicks=60.0;
		double ns=1000000000/amountOfTicks;
		double delta=0;
		long timer=System.currentTimeMillis();
		
		int frames=0;
		
		while(isrunning)
		{
			long now=System.nanoTime();
			delta +=(now-lastTime)/ns;
			lastTime=now;
			
			while(delta>=1)
			{
				tick();
				delta--; 
			}
			
			try{
				render();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			frames++;
			if(System.currentTimeMillis()-timer>1000)
			{
				timer+=1000;
				frames=0;
			}
		}
		stop();
	}
	
	public void tick()
	{
		hand.tick();
	}
	
	public void render()
	{
		BufferStrategy bs=this.getBufferStrategy();
		
		if(bs==null)
		{
			this.createBufferStrategy(3);
			return;
		}
		
		try{
			Graphics g=bs.getDrawGraphics();
			g.setColor(Color.orange);
			g.fillRect(0,0,1000,563);
			
			hand.render(g);

			g.dispose();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		bs.show();
	}
	
	private void LoadLevel(BufferedImage image) {
		
		int w = image.getWidth();
		int h = image.getHeight();
		
		for(int xx=0; xx<w; xx++) {
			
			for(int yy=0; yy<h; yy++) {
				
				int pixel = image.getRGB(xx, yy);
				int red = (pixel >> 16) & 0xff;
				int green = (pixel >> 8) & 0xff;
				int blue = (pixel) & 0xff;
				
				if(red == 100) {
					hand.addObject(new Block(xx*32, yy*32, ID.Block));
				}
				
				if(blue == 100) {
					hand.addObject(new Wizard(xx*32, yy*32, ID.player, hand));
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		new Game();
	}
}
