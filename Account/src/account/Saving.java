
package account;

public class Saving extends Bankacnt
{
    int intest;
    
    
   Saving(int s)
   {
       intest=(totalbalance*s)/100;
        interest(); 
   }
    
    void interest()
    {
        System.out.println("The total balance after interest: "+(totalbalance+intest));
    }
}
