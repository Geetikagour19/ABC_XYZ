package abc.xyz.LinkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class LL_Union_Intersection {

	Node head;
	LL_Union_Intersection getIntersection(Node head1, Node head2){
		HashSet<Integer> hs=new HashSet<Integer>();
		Node n1 = head1;
		Node n2= head2;
		
		LL_Union_Intersection result = new LL_Union_Intersection();
		while(n1!=null){
			if(!hs.contains(n1.data))
				hs.add(n1.data);
			else
				n1=n1.next;				
		}
		while(n2!=null){
			if(hs.contains(n2.data))
				result.push(n2.data);
			n2=n2.next;				
		}
		return result;
	}
	
	LL_Union_Intersection getUnion(Node head1, Node head2){
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		//HashSet<Integer> hs=new HashSet<Integer>();
		Node n1 = head1;
		Node n2= head2;
		
		LL_Union_Intersection result = new LL_Union_Intersection();
		while(n1!=null){
			if(hm.containsKey(n1.data)){
				int val = hm.get(n1.data);
				hm.put(n1.data, val+1);
			}
			else
				hm.put(n1.data, 1);
			n1=n1.next;
		}
		while(n2!=null){
			if(hm.containsKey(n2.data)){
				int val = hm.get(n2.data);
				hm.put(n2.data, val+1);
			}
			else
				hm.put(n2.data, 1);
			n2=n2.next;
		}
		
		for(int a:hm.keySet()){
			result.append(a);
		}
		return result;
	}
	public void append(int data){
		if(this.head==null){
			Node temp=new Node(data);
			this.head=temp;
			return;
		}
		Node n1 = this.head;
		Node n2 = new Node(data);
		while(n1.next!=null){
			n1=n1.next;
		}
		n1.next=n2;
		n2.next=null;
	}
	boolean isPresent(int data){
		Node temp=head;
		while(temp!=null){
			if(temp.data==data)
				return true;
			temp=temp.next;
		}
		return false;
	}
	public void push(int data){
		Node node = new Node(data);
		node.next=head;
		head=node;
	}
	void printList(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String args[])
    {
		LL_Union_Intersection llist1 = new LL_Union_Intersection();
		LL_Union_Intersection llist2 = new LL_Union_Intersection();
		LL_Union_Intersection union = new LL_Union_Intersection();
		LL_Union_Intersection intersection = new LL_Union_Intersection();
 
        /*create a linked list 10->15->4->20 */
        llist1.push(20);
        llist1.push(4);
        llist1.push(15);
        llist1.push(10);
 
        /*create a linked list 8->4->2->10 */
        llist2.push(10);
        llist2.push(2);
        llist2.push(4);
        llist2.push(8);
 
        intersection = intersection.getIntersection(llist1.head,
                                                  llist2.head);
        union=union.getUnion(llist1.head, llist2.head);
 
        System.out.println("First List is");
        llist1.printList();
 
        System.out.println("Second List is");
        llist2.printList();
 
        System.out.println("Intersection List is");
        intersection.printList();
 
        System.out.println("Union List is");
        union.printList();
    }     
}
