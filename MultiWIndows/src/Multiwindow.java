import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JEditorPane;
import javax.swing.JTextField;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

public class Multiwindow {

	private JFrame frame;
	private JPanel First,Second;
	private ImageIcon im,im1;
	private JLabel lblNewLabel_2;
    private Cursor cur;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Multiwindow window = new Multiwindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Multiwindow() {
		initialize();
	}

	
	private void initialize() {
		
		cur=new Cursor(Cursor.CROSSHAIR_CURSOR);
		///im=new ImageIcon(getClass().getResource("image1.jpg"));
		///im1=new ImageIcon(getClass().getResource("back.png"));
		
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Multiwindow.class.getResource("/IMAGE/image1.jpg")));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel Main = new JPanel();
		Main.setBackground(new Color(107, 142, 35));
		frame.getContentPane().add(Main, "name_262382202877786");
		Main.setLayout(null);
		
		JButton b1 = new JButton("Menu1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First.setVisible(true);
				Main.setVisible(false);
			}
		});
		
		b1.setBounds(53, 80, 89, 42);
		b1.setCursor(cur);
		Main.add(b1);
		
		JButton b2 = new JButton("Menu2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Second.setVisible(true);
				Main.setVisible(false);
			}
		});
		b2.setBounds(249, 80, 89, 42);
		Main.add(b2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Multiwindow.class.getResource("/IMAGE/la-liga.png")));
		lblNewLabel_3.setBounds(0, 0, 434, 250);
		Main.add(lblNewLabel_3);
		
		First = new JPanel();
		First.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(First, "name_262421969898188");
		First.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FIRST");
		lblNewLabel.setBounds(167, 69, 85, 57);
		First.add(lblNewLabel);
		
		JButton btnNewButton = new JButton();
		btnNewButton.setIcon(new ImageIcon(Multiwindow.class.getResource("/IMAGE/Arrow-Back-icon.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.setVisible(true);
				First.setVisible(false);
			}
		});
		btnNewButton.setBounds(75, 177, 95, 41);
		First.add(btnNewButton);
		
		Second = new JPanel();
		Second.setBackground(Color.ORANGE);
		frame.getContentPane().add(Second, "name_262487332028299");
		Second.setLayout(null);
		
		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setIcon(new ImageIcon(Multiwindow.class.getResource("/IMAGE/back.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First.setVisible(true);
				Second.setVisible(false);
			}
		});
		///btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBackground(Color.yellow);
		btnNewButton_1.setBounds(55, 181, 95,41);
		Second.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Second");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(135, 62, 74, 57);
		Second.add(lblNewLabel_1);
		
	    lblNewLabel_2 = new JLabel("MY LABEL");
		lblNewLabel_2.setBounds(252, 97, 100,100);
		Second.add(lblNewLabel_2);
	}
}
