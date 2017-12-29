package abc.xyz.LinkedList;

public class ReverseList_GivenSize {
Node head;

Node reverse(Node head, int k){
	Node current = head;
	Node next = null;
	Node prev =null;
	int count=0;
	while(count<k && current!=null ){
		next=current.next;
		current.next=prev;
		prev=current;
		current=next;
		count++;
	}
	if(next!=null){
		head.next=reverse(next,k);
	}
	return prev;
}
	public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
  
        /* 3. Make next of new Node as head */
        new_node.next = head;
  
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
 
    /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
 
     /* Drier program to test above functions */
    public static void main(String args[])
    {
    	ReverseList_GivenSize llist = new ReverseList_GivenSize();
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        llist.push(9);
        llist.push(8);
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
         
        System.out.println("Given Linked List");
        llist.printList();
         
        llist.head = llist.reverse(llist.head, 3);
 
        System.out.println("Reversed list");
        llist.printList();
    }
}
