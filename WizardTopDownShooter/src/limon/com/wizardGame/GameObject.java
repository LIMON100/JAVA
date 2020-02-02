
package limon.com.wizardGame;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject {
    
    protected int X,Y;
    protected float velx=0,vely=0;
    protected ID id;
    
    public GameObject(int x,int y,ID id){
        this.X=x;
        this.Y=y;
        this.id=id;
    }
    
    public abstract void tick();
    public abstract void render(Graphics g);
    public abstract Rectangle getBounds();

    public int getX() {
        return X;
    }

    public void setX(int x) {
        this.X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        this.Y = y;
    }

    public float getVelx() {
        return velx;
    }

    public void setVelx(float velx) {
        this.velx = velx;
    }

    public float getVely() {
        return vely;
    }

    public void setVely(float vely) {
        this.vely = vely;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}