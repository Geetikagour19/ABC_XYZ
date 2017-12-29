package abc.xyz.LinkedList;

public class RemoveEveryKthNode {
Node head;
	static Node deleteKthNode(Node head, int k){
		if(head==null)
			return null;
		if(k==1){
			head=null;
			return null;
		}
		Node ptr=head, prev=null;
		int count =0;
		while(ptr!=null){
			count++;
			if(k==count){
				prev.next=null;
				prev.next=ptr.next;
				count=0;
			}
			if(count!=0)
				prev=ptr;
			ptr=ptr.next;
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
    	RemoveEveryKthNode llist = new RemoveEveryKthNode();
          
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
          
        System.out.println("Original List :");
        llist.printList(llist.head);
        int k = 3;
        llist.head = deleteKthNode(llist.head, k);
        System.out.println("Modified List :");
        llist.printList(llist.head);
    }
}
