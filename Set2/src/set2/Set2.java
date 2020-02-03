
package set2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set2 {

    public static void main(String[] args){
//            HashSet<String>s=new HashSet<String>();
//            s.add("Limon");
//            s.add("Nion");
//            s.add("Asif");
//            s.add("Zarif");
//            Collections.sort(s);
//            System.out.println(s);

            TreeSet <Integer>tree = new TreeSet<Integer>();
                     TreeSet <Integer>treeheadset = new TreeSet<Integer>();
                     tree.add(12);
                     tree.add(13);
                     tree.add(14);
                     tree.add(15);
                     treeheadset = (TreeSet)tree.tailSet(13);
                     System.out.println(treeheadset);
      
    }
    
}
