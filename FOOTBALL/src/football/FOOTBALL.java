
package football;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FOOTBALL extends JFrame{

    private Container c;
    private JPanel Main,First,Second,Laliga,bpl;
    private JButton b1,b2,b3,b4;
            
    FOOTBALL()
    {
        c=this.getContentPane();
        c.setSize(580, 580);
        //c.setBackground(Color.BLUE);
        c.setLayout(null);
        
        Main=new JPanel();
        Main.setLayout(null);
        Main.setSize(580,580);
        Main.setBackground(Color.yellow);
        c.add(Main);
        
       b1=new JButton("La liga");
       b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 Laliga.setVisible(true);
               Main.setVisible(false);
            }
           
       });
       b1.setBounds(150,150,200,50);
       Main.add(b1);
       
       b2=new JButton("Barclays premier League");
       b2.setBounds(150,250,200,50);
       Main.add(b2);
       
       Laliga=new JPanel();
       Laliga.setLayout(null);
       Laliga.setSize(580,580);
       Laliga.setBackground(Color.yellow);
       Main.add(Laliga);  
       
       b3=new JButton("Back");
        ///b3.setVisible(true);
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 Laliga.setVisible(false);
               Main.setVisible(true);
            }
           
       });
       b3.setBounds(0,0,200,50);
       Laliga.add(b3);
    }
    
    public static void main(String[] args) {
        FOOTBALL f=new FOOTBALL();
        f.setVisible(true);
        f.setSize(580,580);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
