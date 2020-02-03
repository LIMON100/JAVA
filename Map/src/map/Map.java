
package map;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class Map {

    public static void main(String[] args) {
        HashMap< String,Integer> m = new HashMap< String,Integer>();
//        HashMap<String,String>m=new HashMap<>();
//        m.put("Limon","mid");
//         m.put("nion","elder");
//          m.put("ifty","younger");
//           m.put("mim","only");
//           
//           Set<String>s=m.keySet();
//           
//           for(String s1:s){
//           System.out.println(m.get("s1"));
//           }
           
            m.put("Limon",1);
            m.put("Asif",3);
            m.put("Nion",2);
            
            System.out.println(  m.containsKey("NION"));
    }
    
}
