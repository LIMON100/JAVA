
package priority;

import java.util.PriorityQueue;

public class Priority {

    public static void main(String[] args) {
       PriorityQueue<String>pq=new PriorityQueue<String>();
       pq.add("C");
       pq.add("C++");
       pq.add("java");
       pq.add("Python");
       pq.offer("jav");
       pq.add("JAVASCRIPT");
       pq.offer("LIMON");
        System.out.println(pq.peek());
        
        pq.poll();
        System.out.println(pq);
        
        boolean b=pq.contains("c");
        System.out.println(b);
    }
    
}
