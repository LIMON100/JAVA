
package inheritance;

public class A 
{
    String color;
    int weight;
    
    A(String c,int w)
    {
        color=c;
        weight=w;
    }
    
    void attribute()
    {
        System.out.println("Color: "+color);
        System.out.println("Weight: "+weight);
    }
}
