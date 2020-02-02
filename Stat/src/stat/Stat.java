
package stat;

public class Stat 
{
  static int a;
  int b;
  
  static void set()
  {
      a=20;
  }
  
  static void print()
  {
      set();
      System.out.println(a);
  }
    public static void main(String[] args) 
    {
        Stat ob=new Stat();
        ob.b=25;
        print();
        System.out.println(ob.b);
        
    }
    
}
