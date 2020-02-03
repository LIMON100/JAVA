import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class menu {

	private JFrame frame;
    private ImageIcon im;
    private JPanel panel;
    private JButton btnNewButton;
    private JPanel panel_1;
    private JTextField textField;
    private JButton btnNewButton_1;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public menu() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 715, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		im=new ImageIcon(getClass().getResource("menu2.png"));
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 92, 102, 46);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnNewButton = new JButton("me");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.setVisible(true);
				panel.setVisible(false);
			}
		});
		btnNewButton.setBounds(0, 0, 53, 35);
		panel.add(btnNewButton);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 141, 187, 257);
		panel_1.setVisible(false);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 21, 177, 35);
		panel_1.add(textField);
		textField.setColumns(10);
		
		btnNewButton_1 = new JButton("search");
		btnNewButton_1.setBounds(46, 84, 89, 23);
		panel_1.add(btnNewButton_1);
		
	}
}
