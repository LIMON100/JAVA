
package workers;

public class CBE implements Commission_base
{
    @Override
    public void employeetype()
    {
        System.out.println("I am Commission-base employee.");
    }
    @Override
    public void salary()
    {
        System.out.println("My salary is 10% from the project earning.");
    }
    @Override
    public void workhours()
    {
        System.out.println("My working time depends on owner.");
    }
    CBE()
    {
        employeetype();
        salary();
        workhours();
    }
}
