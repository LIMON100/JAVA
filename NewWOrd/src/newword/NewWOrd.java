
package newword;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class NewWOrd {

    public static void main(String[] args) {
        Map<String,Integer>m=new HashMap<String,Integer>();
        create(m);
        display(m);
    }
    
    public static void create(Map<String,Integer>map)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input=sc.nextLine();
        
        String[]tokens=input.split(" ");
        
        for(String t:tokens)
        {
            String word=t.toLowerCase();
            if(map.containsKey(word))
            {
                int count=map.get(word);
                map.put(word, count+1);
                
            }
            else
            {
                map.put(word,1);
            }
        }
        
    }
    
    public static void display(Map<String,Integer>map)
    {
        Set<String>keys=map.keySet();
       TreeSet<String>sorted=new TreeSet<String>(keys);
        
        for(String key: keys)
        {
            System.out.printf("%-10s%10s\n",key,map.get(key));
        }
    }
    
}
