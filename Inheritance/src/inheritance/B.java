
package inheritance;

public class B extends A
{
   int gear;
   
   B(String c,int w,int g)
   {
       super(c,w);
       gear=g;
   }
   
   @Override
   void attribute()
   {
       super.attribute();
       System.out.println("Gear: "+gear);
   }
}
