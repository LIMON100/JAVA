
package list;

import java.util.ArrayList;


public class List {

    public static void main(String[] args) {
       ArrayList mylist=new ArrayList();
       mylist.add("object 1");
       mylist.add("object 2");
       mylist.add("object 3");
       mylist.add("object 50");
       
      mylist.remove(2);
        System.out.println( mylist);
    }
    
}
