package limon.com.wizardGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Wizard extends GameObject{

    HandleEverything handle;
    //private int speed = 3;
    
    public Wizard(int x, int y, ID id, HandleEverything handle) {
        super(x, y, id);
        this.handle = handle;
    }
    
    public void tick() {
        X +=velx;
        Y +=vely;
        
        ///movement();
        
        if(handle.isUp()) vely = -5;
        else if(!handle.isDown()) vely = 0;
        
        if(handle.isDown()) vely =  5;
        else if(!handle.isUp()) vely = 0;
        
        if(handle.isRight()) velx = 5;
        else if(!handle.isLeft()) velx = 0;
        
        if(handle.isLeft()) velx = -5;
        else if(!handle.isRight()) velx = 0;
    }
    
    /*private void movement() {
		if (handle.isUp()) {
			this.vely = -speed;
		} else if (!handle.isDown()) {
			this.vely = 0;
		}
		if (handle.isDown()) {
			this.vely = speed;
		} else if (!handle.isUp()) {
			this.vely = 0;
		}
		if (handle.isLeft()) {
			this.velx = -speed;
		} else if (!handle.isRight()) {
			this.velx = 0;
		}
		if (handle.isRight()) {
			this.velx = speed;
		} else if (!handle.isLeft()) {
			this.velx = 0;
		}
	}*/
    
    public void render(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(X, Y, 32, 48);
    }
    
    public Rectangle getBounds() {
        return new Rectangle(X,Y,32,48); 
    }
    
}
