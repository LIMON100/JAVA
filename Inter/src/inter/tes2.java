
package inter;

public class tes2 implements Test1
{
    static int val=34;
    @Override
    public void display()
    {
        System.out.println(Test1.val);
        System.out.println(val);
    }
}
