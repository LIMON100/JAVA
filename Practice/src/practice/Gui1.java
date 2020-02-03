
package practice;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class Gui1 {
    public static void main(String[] args) {
     Frame f = new Frame("TestMouseListener");
    f.setSize(500,500);
    f.setVisible(true);

    f.addMouseListener(new MouseAdapter(){
      public void mouseClicked(MouseEvent e){
	System.out.println("Mouse clicked: ("+e.getX()+","+e.getY()+")");
        }
    });
}
}
