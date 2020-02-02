
package account;

public class Checking extends Bankacnt
{
    int fee;
    
          Checking(int f)
            {
                fee=f;
               reducebalance();
            }
       
    void reducebalance()
    {
        System.out.println("After taking fees the total balance now: "+(totalbalance-fee));
    }
}
