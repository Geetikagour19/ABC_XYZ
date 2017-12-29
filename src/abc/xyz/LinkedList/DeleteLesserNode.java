package abc.xyz.LinkedList;

public class DeleteLesserNode {
Node head;
void delLesserNodes(){
	reverse();
	delLesserNodesUtil();
	reverse();
}
void delLesserNodesUtil(){
	Node current = head;
	Node maxNode=head;
	Node temp;
	while(current!=null&&current.next!=null){
		if(current.next.data < maxNode.data){
			temp=current.next;
			current.next=temp.next;
			temp=null;
		}
		else{
			current=current.next;
			maxNode=current;
		}
	}
}
void reverse(){
	Node current=head;
	Node next=null;
	Node prev=null;
	while(current!=null){
		next=current.next;
		current.next=prev;
		prev=current;
		current=next;
	}
	head=prev;
}
void push(int data){
	Node node = new Node(data);
	node.next=head;
	head=node;
}
void printList(){
	Node temp = head;
	while(temp!=null){
	System.out.print(temp.data+" ");
	temp=temp.next;
	}
	System.out.println();
}
public static void main(String args[])
{
	DeleteLesserNode llist = new DeleteLesserNode();

    /* Constructed Linked List is 12->15->10->11->
       5->6->2->3 */
    llist.push(3);
    llist.push(2);
    llist.push(6);
    llist.push(5);
    llist.push(11);
    llist.push(10);
    llist.push(15);
    llist.push(12);

    System.out.println("Given Linked List");
    llist.printList();

    llist.delLesserNodes();

    System.out.println("Modified Linked List");
    llist.printList();
}
}
