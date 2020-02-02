
package temparatureconverter;

import java.util.Scanner;

public class TemparatureConverter {

    public static void main(String[] args) 
    {
        Scanner c=new Scanner(System.in);
        double cel,farn;
        
        System.out.println("Enter celcius value: ");
        cel=c.nextDouble();
        
        farn=0.5*cel-32;
        System.out.println(farn);
    }
    
}
