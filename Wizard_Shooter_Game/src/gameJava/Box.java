package gameJava;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Box extends GameObject {

	public Box(int x, int y, ID id) {
		super(x, y, id);
		velx=1;
	}

	@Override
	public void tick() {
		x+=velx;
		y+=vely;
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillRect(x, y, 32, 32);
	}

	@Override
	public Rectangle getbounds() {
		return null;
	}

}
