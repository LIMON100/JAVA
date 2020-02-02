
package others;

import java.util.PriorityQueue;
import java.util.Stack;

public class Others {

    public static void main(String[] args) {
        PriorityQueue<Integer> q =new PriorityQueue<Integer>();
        
        q.offer(4);
        q.offer(43);
        q.offer(44);
        q.poll();
        System.out.println(q.size());
    }
    
}
