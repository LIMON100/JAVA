
package workers;

public class FTE implements Fulltime
{
   @Override
    public  void employeetype()
    {
        System.out.println("I am Full-time employee.");
    }
   @Override
    public void salary()
    {
        System.out.println("My salary is 50000 taka.");
    }
    public FTE()
    {
        employeetype();
        salary();
    }
}
