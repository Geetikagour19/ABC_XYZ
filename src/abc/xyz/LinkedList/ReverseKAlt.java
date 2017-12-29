package abc.xyz.LinkedList;

public class ReverseKAlt {
static Node head;

Node kAltReverse(Node head, int k){
	Node current = head;
	Node next=null,prev=null;
	int count=0;
	while(count<k&&current!=null){
		next=current.next;
		current.next=prev;
		prev=current;
		current=next;
		count++;
	}
	if(head!=null){
		head.next=current;
	}
	count=0;
	while(count<k-1 && current!=null){
		current=current.next;
		count++;
	}
	if(current!=null){
		current.next=kAltReverse(current.next, k);
	}
	return prev;
}
	 void printList(Node node) {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	 
	    void push(int newdata) {
	        Node mynode = new Node(newdata);
	        mynode.next = head;
	        head = mynode;
	    }
	 
	    public static void main(String[] args) {
	    	ReverseKAlt list = new ReverseKAlt();
	 
	        // Creating the linkedlist
	        for (int i = 21; i > 0; i--) {
	            list.push(i);
	        }
	        System.out.println("Given Linked List :");
	        list.printList(head);
	        head = list.kAltReverse(head, 3);
	        System.out.println("");
	        System.out.println("Modified Linked List :");
	        list.printList(head);
	 
	    }
}
