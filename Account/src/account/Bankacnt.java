
package account;

public class Bankacnt 
{
    int accntnumber;
    int totalbalance=1000;
    
    /*Bankacnt(int b)
    {
        totalbalance=b;
    }*/
    
    void deposit(int depo)
    {
        totalbalance=totalbalance+depo;
    }
    
    void withdrew(int w)
    {
        totalbalance=totalbalance-w;
    }
    
    void getbalance()
    {
        System.out.println("TOTAL BALANCE NOW: "+totalbalance);
    }
}
