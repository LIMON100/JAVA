package word;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Word {
    BufferedWriter bw=null;
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Map<String,Integer>m=new HashMap<String,Integer>();
        createmap(m);
        displaymap(m);
    }
    
    private static void createmap(Map<String,Integer>map) throws FileNotFoundException 
    {
        BufferedReader br=null;
         String input;
         br=new BufferedReader(new FileReader("Text.txt"));
         
        try {
            while((input=br.readLine())!=null){
                
                String[]tokens=input.split(" ");
                
          for(String token: tokens)
        {
            String word=token.toLowerCase();
            if(map.containsKey(word))
            {
                int count=map.get(word);
                map.put(word,count+1);
            }
            else
            {
                map.put(word,1);
            }
            
        }
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Word.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void displaymap(Map<String,Integer>map) throws IOException
    {
        
        FileWriter out=null;
        out=new FileWriter("output.txt");
        PrintWriter wr=new PrintWriter(out);
        Set<String>keys=map.keySet();
        TreeSet<String>t=new TreeSet<String>(keys);
        
        for(String key: t)
        {
          
            wr.printf("%-10s%10s\n",key,map.get(key));
            wr.println();
          
        }
        ///System.out.printf("\nsize: %d\nisempty: %b\n",map.size(),map.isEmpty());
        wr.println();
        wr.printf("\nsize: %d",map.size());
        wr.println();
        wr.printf("is empty: %b",map.isEmpty());
        wr.close();
    }
    
}
