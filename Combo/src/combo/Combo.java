package combo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Combo {

    JFrame j=new JFrame();
    JPanel p=new JPanel();
    JButton b=new JButton("Print");
    JLabel l=new JLabel("This is new");
    
    String[] items={"Limon","Nion","Ifty"};
    JComboBox c=new JComboBox(items);
    
    public Combo()
    {
        frame();
    }
    
    public void frame()
    {
        j.setVisible(true);  
        j.setBounds(100, 100,500, 500);
        j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
        
        p.add(c);
        p.add(b);
        p.add(l);
        
        j.add(p);
        
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent a)
            {
                String s=c.getSelectedItem().toString();
                l.setText(s);
            }
        });
    }
    
    public static void main(String[] args) {
        new Combo();
    }
    
}
