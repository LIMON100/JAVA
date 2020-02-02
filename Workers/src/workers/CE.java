
package workers;

public class CE implements Contractual
{
    @Override
    public void employeetype()
    {
        System.out.println("I am Contractual employee.");
    }
    @Override
    public void salary()
    {
        System.out.println("It depends on work_type");
    }
    @Override
    public void workhours()
    {
        System.out.println("It mainly depends on owner.");
    }
    CE()
    {
      employeetype();
       salary();
        workhours();
        
    }
}
