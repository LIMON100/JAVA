
package string1;

public class String1 {

    
    public static void main(String[] args) 
    {
        String s="Bangladesh is my country";
        System.out.println(s);
        
        char ch=s.charAt(0);
        System.out.println(ch);
        
        int value=s.codePointAt(11);
        System.out.println(value);
        
        int valu=s.indexOf('n');
        System.out.println(valu);
        
        int val=s.lastIndexOf('n');
        System.out.println(val);
    }
    
}
