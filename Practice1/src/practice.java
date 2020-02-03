import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class practice extends JFrame {

	private Container c;
	private JPanel Main,First,Second;
	private JButton b1,b2,b3,b4,back;
	
	public practice()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(580, 580);
		
		c=this.getContentPane();
		c.setLayout(null);
		
		Main=new JPanel();
		Main.setSize(580,580);
		Main.setBackground(Color.CYAN);
		Main.setLayout(null);
		c.add(Main);
		
		b1=new JButton("MENU-1");
		b1.setBounds(100, 100, 100, 50);
		Main.add(b1);
		
		b2=new JButton("MENU-2");
		b2.setBounds(220, 100, 100, 50);
		Main.add(b2);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				First.setVisible(true);
				Main.setVisible(false);
				
			}
		});
		
		First=new JPanel();
		First.setBackground(Color.green);
		First.setLayout(null);
		c.add(First);
		
		b3=new JButton("BACK");
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.setVisible(true);
				First.setVisible(false);
			}
		});
		b3.setBounds(50, 50, 100, 100);
		First.add(b3);
		
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Second.setVisible(true);
				Main.setVisible(false);
				
			}
		});
		Second=new JPanel();
		c.add(Second);
		
		b4=new JButton("BACK");
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.setVisible(true);
				Second.setVisible(false);
			}
		});
		b4.setBounds(50, 50, 100, 100);
		Second.add(b4);
		
	}
	
	public static void main(String args[])
	{
		practice j=new practice();
		j.setVisible(true);
		
	}
	
}
