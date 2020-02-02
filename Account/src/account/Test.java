
package account;

public class Test 
{
    public static void main(String[] args) 
    {
       Bankacnt ob=new Bankacnt();
       
       ob.deposit(2000);
       ob.withdrew(500);
       ob.getbalance();
       
       Saving ob1=new Saving(12);
       Checking ob2=new Checking(200);
    }
}