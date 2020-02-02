
package string_sss;

public class String_sss 
{

    public static void main(String[] args) 
    {
        String s1="Mahmudr rahman limon";
        String s2=new String("Mahmudr Rahman limon");
        System.out.println(s1);
        int len=s1.length();
        System.out.println(len);
        
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not equal");
        }
        
        boolean con=s1.contains("raman");
        System.out.println(con);
    }
    
}
