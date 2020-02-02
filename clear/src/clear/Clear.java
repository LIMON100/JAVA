
package clear;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Clear {

    public static void main(String[] args) {
       List<Integer>name=new ArrayList<Integer>();
       name.add(1);
       name.add(4);
       name.add(12);
       name.add(545);

        List<Integer>name1=new ArrayList<Integer>();
        
        name1.add(2);
       name1.add(5);
       name1.add(13);
       name1.add(546);
       
        System.out.println(Collections.frequency(name,121));
       
    }
    
}
