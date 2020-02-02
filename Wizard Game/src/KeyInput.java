import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{

	Handle hand;
	
	public KeyInput(Handle hand)
	{
		this.hand=hand;
	}
	
	public void keyPressed(KeyEvent e)
	{
		int key=e.getKeyCode();
		
		for(int i=0; i<hand.object.size(); i++)
		{
			
			GameObject tempObject=hand.object.get(i);
			
			if(tempObject.getId()==ID.player)
			{
				if(key==KeyEvent.VK_W)
					hand.setUp(true);
				if(key==KeyEvent.VK_S)
					hand.setDown(true);
				if(key==KeyEvent.VK_D)
					hand.setRight(true);
				if(key==KeyEvent.VK_A)
					hand.setLeft(true);
			}
		}
	}
	
	public void KeyReleased(KeyEvent e)
	{
        int key=e.getKeyCode();
		
		for(int i=0; i<hand.object.size(); i++)
		{
			GameObject tempObject=hand.object.get(i);
			
			if(tempObject.getId()==ID.player)
			{
				if(key==KeyEvent.VK_W)
					hand.setUp(false);
				if(key==KeyEvent.VK_S)
					hand.setDown(false);
				if(key==KeyEvent.VK_D)
					hand.setRight(false);
				if(key==KeyEvent.VK_A)
					hand.setLeft(false);
			}
		}
	}
}
