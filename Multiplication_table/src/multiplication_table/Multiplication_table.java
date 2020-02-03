package multiplication_table;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Multiplication_table extends JFrame {

    private Container c;
    private ImageIcon img;
    private JLabel lbl,tx;
    private JTextField tf; 
    private Font f;
    private JTextArea ta;
    private JButton b;
    
    public Multiplication_table()
    {
        frame();
    }
    
    public void frame()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        
        img=new ImageIcon(getClass().getResource("multi.jpg"));
        f=new Font("Arial",Font.BOLD,18);
        
        lbl=new JLabel(img);
        lbl.setBounds(50,10,img.getIconWidth(),img.getIconHeight());
        c.add(lbl);
        
        tx=new JLabel("Enter any number");
        tx.setForeground(Color.black);
        tx.setBounds(50, 370, 250, 50);
        tx.setFont(f);
        c.add(tx);
        
        tf=new JTextField();
        tf.setBounds(225, 370, 80, 50);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setFont(f);
        c.add(tf);
        
        b=new JButton("Clear");
        b.setBounds(335, 370, 80, 50);
        b.setFont(f);
        c.add(b);
        
        
        ta=new JTextArea();
        ta.setBounds(60, 460, 400, 240);
        ta.setFont(f);
        ta.setBackground(Color.green);
        c.add(ta);
        
        tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String value=tf.getText();
				
				if(value.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "You did not put any number.");
				}

				else {
					
					ta.setText(" ");
					int num=Integer.parseInt(tf.getText());
					for(int i=1; i<=10; i++)
					{
						int result=num*i;
						
						String r1=String.valueOf(result);
						String n=String.valueOf(num);
						String incr=String.valueOf(i);
						
						ta.append(n+" X "+incr +" = "+r1 +"\n");
					}
				}
				
			}
		});
	    
	    b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText(" ");
				
			}
		});
	    
	}
    
    public static void main(String[] args) {
       
        Multiplication_table j=new Multiplication_table();
        j.setVisible(true);
        j.setSize(580,1080);
        j.setTitle("Multiplication table.");
    }
    
}
