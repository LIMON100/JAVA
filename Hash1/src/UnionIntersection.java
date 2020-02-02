import java.util.HashMap;
import java.util.HashSet;

public class UnionIntersection {
	
	Node head;
	
	class Node
	{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
		
		void push(int data) {
			Node new_node=new Node(data);
			new_node.next=head;
			head=new_node;
		}
		
		void print() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		
	   public void append(int data) 
	    { 
	        if(this.head == null) 
	        { 
	            Node n = new Node(data); 
	            this.head = n; 
	            return; 
	        } 
	        
	        Node n1 = this.head; 
	        Node n2 = new Node(data); 
	        while(n1.next != null) 
	        { 
	            n1 = n1.next; 
	        } 
	              
	        n1.next = n2; 
	        n2.next = null; 
	    }
	   
	   boolean isPresent(Node head,int data) {
		   Node t=head;
		   while(t!=null) {
			   if(t.data==data)
				   return true;
			   t=t.next;
		   }
		   return false;
	   }
	
	UnionIntersection getIntersection(Node head1 , Node head2) {
		HashSet<Integer> hset=new HashSet<Integer>();
		Node n1=head1;
		Node n2=head2;
		UnionIntersection result=new UnionIntersection();
		
		while(n1!=null) {
			if(hset.contains(n1.data)) {
				hset.add(n1.data);
			}
			else {
				hset.add(n1.data);
			}
			n1=n1.next;
		}
		
		while(n2!=null) {
			if(hset.contains(n2.data)){
				result.push(n2.data);
			}
			n2=n2.next;
		}
		
		return result;
	}
	
	UnionIntersection getUnion(Node head1,Node head2) {
		HashMap<Integer, Integer> hmap = new HashMap<>(); 
	    Node n1 = head1; 
	    Node n2 = head2; 
	    UnionIntersection result = new UnionIntersection(); 
	    
	    while(n1!=null) {
	    	if(hmap.containsKey(n1.data)) {
	    		int val=hmap.get(n1.data);
	    		hmap.put(n1.data, val+1);
	    	}
	    	else {
	    		hmap.put(n1.data, 1);
	    	}
	    	n1=n1.next;
	    }
	    
	    
	    while(n2 != null) 
	    { 
	        if(hmap.containsKey(n2.data)) 
	        { 
	            int val = hmap.get(n2.data); 
	            hmap.put(n2.data, val + 1); 
	        } 
	        else
	        { 
	            hmap.put(n2.data, 1); 
	        } 
	        n2 = n2.next;  
	    }
	    
	    for(int a:hmap.keySet()) {
	    	result.append(a); 
	    }
	    return result;
	}
	
	public static void main(String[]args)
	{
		UnionIntersection list1=new UnionIntersection();
		UnionIntersection list2=new UnionIntersection();
		UnionIntersection union=new UnionIntersection();
		UnionIntersection intersection=new UnionIntersection();
		
		list1.push(20); 
        list1.push(4); 
        list1.push(15); 
        list1.push(10); 
  
        list2.push(10); 
        list2.push(2); 
        list2.push(4); 
        list2.push(8); 
        
        intersection = intersection.getIntersection(list1.head,list2.head);
        
        union=union.getUnion(list1.head,list2.head);
        
        System.out.println("1st list: ");
        list1.print();
        System.out.println("2nd list: ");
        list2.print();
        System.out.println("Intersection: ");
        intersection.print();
        System.out.println("Union: ");
        union.print();
  
	}
}
