package abc.xyz.LinkedList;

public class SortLLArleadySortedAbsVals {

	Node head;
	Node sortedList(Node head){
		Node prev=head;
		Node curr=head.next;
		while(curr!=null){
			if(curr.data<prev.data){
				prev.next=curr.next;
				curr.next=head;
				head=curr;
				curr=prev;
			}else
				prev=curr;
			curr=curr.next;
		}
		return head;
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
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
     
    /* Driver program to test above functions */
    public static void main(String args[])
    {
    	SortLLArleadySortedAbsVals llist = new SortLLArleadySortedAbsVals();
          
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        llist.push(-5);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(-2);
        llist.push(1);
        llist.push(0);
          
        System.out.println("Original List :");
        llist.printList(llist.head);
          
        llist.head = llist.sortedList(llist.head);
  
        System.out.println("Sorted list :");
        llist.printList(llist.head);
    }
}
