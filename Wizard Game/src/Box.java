import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Box extends GameObject{

	public Box(int x, int y, ID id) {
		super(x, y, id);
	}

	public void tick() {
		x+=velx;
		y+=vely;
	}

	
	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, 32, 32);
		
	}

	
	public Rectangle getBounds() {
		
		return null;
	}

	
	
}
