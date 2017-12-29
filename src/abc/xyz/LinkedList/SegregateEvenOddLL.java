package abc.xyz.LinkedList;

public class SegregateEvenOddLL {

	Node head;
	
	void segregateEvenOdd(){
		Node evenStart=null;
		Node evenEnd=null;
		Node oddStart=null;
		Node oddEnd=null;
		Node current=head;
		while(current!=null){
			int i = current.data;
			if(i%2==0){
				if(evenStart==null){
					evenStart=current;
					evenEnd=evenStart;
				}else{
					evenEnd.next=current;
					evenEnd=evenEnd.next;
				}
			}else{
				if(oddStart==null){
					oddStart=current;
					oddEnd=oddStart;
					
				}else{
					oddEnd.next=current;
					oddEnd=oddEnd.next;
				
				}
			}
			current=current.next;	
		}
		if(evenStart==null || oddStart==null)
			return;
		
		evenEnd.next=oddStart;
		oddEnd.next=null;
		head=evenStart;
	}
	void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
  
        /* 3. Make next of new Node as head */
        new_node.next = head;
  
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
  
    // Utility function to print a linked list
    void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
     
    /* Drier program to test above functions */
    public static void main(String args[])
    {
        SegregateEvenOddLL llist = new SegregateEvenOddLL();
        llist.push(11);
        llist.push(10);
        llist.push(9);
        llist.push(6);
        llist.push(4);
        llist.push(1);
        llist.push(0);
        System.out.println("Origional Linked List");
        llist.printList();
  
        llist.segregateEvenOdd();
  
        System.out.println("Modified Linked List");
        llist.printList();
    }
}
