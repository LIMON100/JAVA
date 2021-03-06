package gameJava;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject {

	protected int x,y;
	protected int velx=0, vely=0;
	protected ID id;
	
	public GameObject(int x,int y,ID id) {
		this.x=x;
		this.y=y;
		this.id = id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	public abstract Rectangle getbounds();
	
	public ID getID() {
		return id;
	}

	public void setID(ID iD) {
		id = iD;
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getVelx() {
		return velx;
	}

	public void setVelx(int velx) {
		this.velx = velx;
	}

	public int getVely() {
		return vely;
	}

	public void setVely(int vely) {
		this.vely = vely;
	}
}
