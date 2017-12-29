package abc.xyz.LinkedList;

public class DeleteNodeWithPtr {

	Node head;
	void push(int data){
		Node temp=new Node(data);
		temp.next=head;
		head=temp;
	}
	void printList(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	void deleteNode(Node ptr){
		Node temp=ptr.next;
		ptr.data=temp.data;
		ptr.next=temp.next;
		temp=null;
	}
	public static void main(String[] args)
    {
		DeleteNodeWithPtr llist = new DeleteNodeWithPtr();

       /* Use push() to construct below list
       1->12->1->4->1  */
       llist.push(1);
       llist.push(4);
       llist.push(1);
       llist.push(12);
       llist.push(1);

       System.out.println("Before deleting");
       llist.printList();

       /* I m deleting the head itself.
       You can check for more cases */
       llist.deleteNode(llist.head);

       System.out.println("\nAfter Deleting");
       llist.printList();
    }
}
