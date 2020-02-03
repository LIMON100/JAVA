
package newtriangle;

import java.util.Scanner;

public class Newtriangle 
{

    public static void main(String[] args) 
    {
        Scanner i=new Scanner(System.in);
        double h,b,a;
        System.out.print("Enter base: ");
        b=i.nextDouble();
        
        System.out.print("Enter h: ");
        h=i.nextDouble();
        
        a=0.5*h*b;
        
        System.out.println(+a);
        
    }
    
}
