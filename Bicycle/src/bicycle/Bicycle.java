
package bicycle;

class Box
{
    int c=0;
    int s=0;
    int g=0;
    
    void changecadence(int value)
    {
        c=value;
    }
    void changegear(int value)
    {
        g=value;
    }
    void changespeed(int value)
    {
        s=value;
    }
    void applybrakes(int decrement)
    {
        s=s-decrement;
    }
    void printstates()
    {
        System.out.println("Cadence:"+c + " Speed:"+s+ " Gear:" +g);
    }

 }

public class Bicycle 
{

    public static void main(String[] args) 
    {
        Box bike1=new Box();
        Box bike2=new Box();
        
        bike1.changecadence(50);
        bike1.changespeed(10);
        bike1.changegear(2);
        bike1.printstates();
    }
    
}
