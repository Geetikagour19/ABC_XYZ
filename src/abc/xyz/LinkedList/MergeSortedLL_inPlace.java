package abc.xyz.LinkedList;

public class MergeSortedLL_inPlace {
Node a,b;
	
	Node sortedmerge(Node h1, Node h2){
		if(h1==null)
			return h2;
		if(h2==null)
			return h1;
		if(h1.data<h2.data){
			h1.next=sortedmerge(h1.next, h2);
			return h1;
		}	
		else{
			h2.next=sortedmerge(h2.next, h1);
			return h2;
		}
	}
		
	void printlist(Node node){
		if(node==null)
			return;
		Node temp=node;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		 
		MergeSortedLL_inPlace list = new MergeSortedLL_inPlace();
        Node result = null;
 
        list.a = new Node(1);
        list.a.next = new Node(3);
        list.a.next.next = new Node(5);
 
        list.b = new Node(0);
        list.b.next = new Node(2);
        list.b.next.next = new Node(4);
 
        System.out.println("List a before merge :");
        list.printlist(list.a);
        System.out.println("");
        System.out.println("List b before merge :");
        list.printlist(list.b);
 
        // merge two sorted linkedlist in decreasing order
        result = list.sortedmerge(list.a, list.b);
        System.out.println("");
        System.out.println("Merged linked list : ");
        list.printlist(result);
 
    }
}
