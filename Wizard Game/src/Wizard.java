import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Wizard extends GameObject{

	Handle hand;
	
	public Wizard(int x, int y, ID id,Handle hand) {
		super(x, y, id);
		this.hand=hand;
	}

	public void tick() {
		x +=velx;
		y +=vely;
		
		if(hand.isUp()) vely = -3;
		else if(!hand.isDown()) vely=0;
		
		if(hand.isDown()) vely=3;
		else if(!hand.isUp())vely=0;
		
		if(hand.isRight()) velx=3;
		else if(!hand.isLeft()) velx=0;
		
		if(hand.isLeft()) velx=-3;
		else if(!hand.isRight()) velx=0;
		
	}

	public void render(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, 32, 48);
	}

	public Rectangle getBounds() {
		return new Rectangle(x,y,32,48);
	}

}
