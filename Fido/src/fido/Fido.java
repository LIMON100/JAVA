
package fido;

class dog
{
    String name;
    int age;

   dog(String n, int age) 
{
    name = n;
    this.age = age;   
 }
   
   void bark() 
   { 
       System.out.println("Woof!");
   }
   
   void wakeTheNeighbors( )
   {
      int i = 50;
     while (i > 0) 
     {
         bark( );
         i--;
     }
   }
   
}



public class Fido
{

    public static void main(String[] args) 
    {
       dog fido = new dog("Fido",5);
       fido.wakeTheNeighbors();
    }
    
}
