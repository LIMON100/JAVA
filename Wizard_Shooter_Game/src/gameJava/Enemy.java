package gameJava;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Enemy extends GameObject{

	HandleEverything handle;
	
	public Enemy(int x, int y, ID id, HandleEverything handle) {
		super(x, y, id);
		this.handle = handle;
	}

	public void tick() {
		x +=velx;
		y +=vely;
		
		if(handle.isUp()) vely = -5;
		else if(!handle.isDown()) vely = 0;
		
		if(handle.isDown()) vely = 0;
		else if(!handle.isUp()) vely = 5;
		
		if(handle.isRight()) vely = 5;
		else if(!handle.isLeft()) vely = 0;
		
		if(handle.isLeft()) vely = -5;
		else if(!handle.isRight()) vely = 0;
	}

	public void render(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, 32, 48);
	}

	public Rectangle getbounds() {
		return new Rectangle(x,y,32,48);
	}
	
}
