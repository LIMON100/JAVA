package gameJava;

import java.awt.Dimension;

import javax.swing.JFrame;


public class Window {

	public Window(int Width,int Height,String title,MainGame game) {
		
		JFrame j = new JFrame(title);
		
		j.setPreferredSize(new Dimension(Width,Height));
		j.setMaximumSize(new Dimension(Width,Height));
		j.setMinimumSize(new Dimension(Width,Height));
		
		j.add(game);
		j.setResizable(false);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setLocationRelativeTo(null);
		j.setVisible(true);
		
	}
	
}
