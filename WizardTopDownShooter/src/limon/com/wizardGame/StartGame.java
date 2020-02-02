package limon.com.wizardGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class StartGame extends Canvas implements Runnable{
    
	private static final long serialVersionUID = 1L;
	private boolean running = false;
	private Thread t1;
	private HandleEverything handle;
	
	public StartGame() {
		
		new Window(1100,500,"Wizard Top-Down Shooter",this);
           
		start();
		
		handle = new HandleEverything();
		
		this.addKeyListener(new KeyInput(handle));
                
                handle.addObject(new Wizard(300,100,ID.Player,handle));
	}
	
	public void start() {
		running = true;
		t1 = new Thread(this);
		t1.start(); 
	}
	
	public void stop() {
		running = false;
		try {
			t1.join();
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
		
		while(running)
		{
			long now=System.nanoTime();
			delta +=(now-lastTime)/ns;
			lastTime=now;
			
			while(delta>=1)
			{
				tick();
				delta--; 
			}
			
			render();
			frames++;
			if(System.currentTimeMillis()-timer>1000)
			{
				timer+=1000;
				frames=0;
			}
		}
		stop();
	}
	
	public void tick() {
            handle.tick();
	}
	
	public void render() {
		
		BufferStrategy buffer = this.getBufferStrategy();
		if(buffer == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = buffer.getDrawGraphics();
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, 1100, 500);
                
                handle.render(g);
		
		g.dispose();
		buffer.show();
	}
	
	public static void main(String[]args) {
		new StartGame();
	}
}
