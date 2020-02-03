package massage1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Massage1{
    public static void main(String[] args) {
      String word = null;
       Map<String,String>m=new HashMap<>();
       Scanner sc=new Scanner(System.in);
       String input=sc.nextLine();
       
        String []sp=input.split(" ");
        
       for(String t: sp)
       {
           word=t.toLowerCase();
           ///System.out.println(word.length());
       }
       
        System.out.println(word.length());
    }
}
