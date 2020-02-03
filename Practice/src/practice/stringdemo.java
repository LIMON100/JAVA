
package practice;

public class stringdemo {
    public static void main(String[] args) {
//       String n="    Mahmudur Rahman Limon   ";
//       String n1="Limon";  
//       int n2=n.indexOf("u");
//        System.out.println(n2);
//        String s=n.trim();
//        System.out.println(s);

          StringBuffer s1=new StringBuffer("Anisul");
          s1.append(" Islam ");
          s1.append(23);
          
          s1.delete(0,5);
          System.out.println(s1);
          
    }
}
