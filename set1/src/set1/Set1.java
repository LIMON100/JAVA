
package set1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

    public static void main(String[] args) {
       Set<Integer>values=new LinkedHashSet<>();
       Set<String>s=new TreeSet<String>();
       values.add(3);
       values.add(32);
       values.add(31);
       values.add(322);
       
       s.add("lIMON");
       s.add("niON");
       s.add("mim");
       s.add("ifty");
       for(String i: s)
       {
           System.out.println(i);
       }
    }
    
}
