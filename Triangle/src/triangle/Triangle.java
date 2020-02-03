
package triangle;

import java.util.Scanner;

public class Triangle 
{

    public static void main(String[] args) 
    {
      Scanner input=new Scanner(System.in);
        double radi,a;
        
        System.out.println("Enter radius of the circle: ");
        radi=input.nextDouble();
        
        a=3.1416*radi*radi;
        
        System.out.println("the area is: "+a);
    }
    
}
