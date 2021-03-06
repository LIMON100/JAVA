package gameJava;

import java.awt.Graphics;
import java.util.LinkedList;

public class HandleEverything {

	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	private boolean up=false,down=false,right=false,left=false;
	
	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public void tick() {
		for(int i=1; i<=object.size(); i++) {
			GameObject temp = object.get(i);
			System.out.println("Size of the gameobject+ "+object.size());
			
			temp.tick();
		}
	}
	
	public void render(Graphics g) {
		for(int i=1; i<=object.size(); i++) {
			GameObject temp = object.get(i);
			
			temp.render(g);
		}
	}
	
	public void addObject(GameObject temp) {
		object.add(temp);
	}
	
	public void removeObject(GameObject temp) {
		object.add(temp);
	}
}
