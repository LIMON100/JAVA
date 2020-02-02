
package date1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

  
    public static void main(String[] args) 
    {
        Date date=new Date();
        ///System.out.println(date);
        
        DateFormat dateFormat=new SimpleDateFormat("MM/dd/YY");
        String current=dateFormat.format(date);
        System.out.println(current);
        
    }
    
}
