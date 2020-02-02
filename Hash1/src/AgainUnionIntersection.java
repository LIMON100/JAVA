import java.util.HashMap;
import java.util.HashSet;

public class AgainUnionIntersection {

	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	void push(int data) {
		Node d=new Node(data);
		d.next=head;
		head=d;
	}
	
	public void append(int d){
		if(this.head==null) {
			Node n=new Node(d);
			this.head=n;
			return;
		}
		Node n1=this.head;
		Node n2=new Node(d);
		while(n1.next!=null) {
			n1=n1.next;
		}
		n1.next=n2;
		n2.next=null;
	}
	
	void printl() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data +" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	AgainUnionIntersection getIntersection(Node head1,Node head2) {
		HashSet<Integer> hset=new HashSet<Integer>();
		Node n1=head1;
		Node n2=head2;
		AgainUnionIntersection result=new AgainUnionIntersection();
		
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
			if(hset.contains(n2.data)) {
				result.push(n2.data);
			}
			n2=n2.next;
		}
		
		return result;
	}
	
	AgainUnionIntersection getUnion(Node head1,Node head2) {
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		Node n1=head1;
		Node n2=head2;
		AgainUnionIntersection result=new AgainUnionIntersection();
		
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
	
	public static void main(String[]args) {
		AgainUnionIntersection l1=new AgainUnionIntersection();
		AgainUnionIntersection l2=new AgainUnionIntersection();
		AgainUnionIntersection union=new AgainUnionIntersection();
		AgainUnionIntersection intersection=new AgainUnionIntersection();
		
		l1.push(55);
		l1.push(4);
		l1.push(88);
		l1.push(1);
		l1.push(22);
		
		l2.push(112);
		l2.push(88);
		l2.push(90);
		l2.push(22);
		
		intersection=intersection.getIntersection(l1.head,l2.head);
		union=union.getUnion(l1.head,l2.head);
		
		System.out.println("1st list: ");
        l1.printl();
        System.out.println();
        System.out.println("2nd list: ");
        l2.printl();
        System.out.println();
        System.out.println("Intersection: ");
        intersection.printl();
        System.out.println();
        System.out.println("Union: ");
        union.printl();
	}
}
