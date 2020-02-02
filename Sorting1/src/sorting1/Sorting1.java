
package sorting1;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting1 {

    public static void main(String[] args) 
    {
        ArrayList<Integer>number = new ArrayList<>();
        
        number.add(12);
        number.add(1);
        number.add(132);
        number.add(21);
        number.add(-1);
        
        System.out.println("Before sorting: "+number);
        
        Collections.sort(number);
        System.out.println("After sorting Asecnding order: "+number);
        
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("After sorting Desecnding order: "+number);
        
    }
    
}
