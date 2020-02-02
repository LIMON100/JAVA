package limon.com.wizardGame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
    
    HandleEverything handle;
    
    public KeyInput(HandleEverything handle){
        this.handle = handle;
    }
    
    public void keyPressed(KeyEvent e){
        int key = e.getExtendedKeyCode();
        
        for(int i=0; i<handle.object.size(); i++){
            GameObject temp = handle.object.get(i);
            
            if(temp.getId() == ID.Player){
                if(key == KeyEvent.VK_W) handle.setUp(true);
                if(key == KeyEvent.VK_S) handle.setDown(true);
                if(key == KeyEvent.VK_A) handle.setLeft(true);
                if(key == KeyEvent.VK_D) handle.setRight(true);
            }
            
        }
    }
    
    public void KeyReleased(KeyEvent e){
        
         int key = e.getExtendedKeyCode();
        
        for(int i=0; i<handle.object.size(); i++){
            
            GameObject temp = handle.object.get(i);
            
            if(temp.getId() == ID.Player){
                if(key == KeyEvent.VK_W) handle.setUp(false);
                if(key == KeyEvent.VK_S) handle.setDown(false);
                if(key == KeyEvent.VK_A) handle.setLeft(false);
                if(key == KeyEvent.VK_D) handle.setRight(false);
            }
        }
        
    }
    
}
