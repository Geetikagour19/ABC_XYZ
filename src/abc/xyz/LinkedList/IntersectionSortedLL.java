package abc.xyz.LinkedList;

public class IntersectionSortedLL {

	Node head;
	
	static Node sortedIntersect(Node a, Node b){
		if(a==null || b==null)
			return null;
		if(a.data<b.data)
			return sortedIntersect(a.next,b);
		if(a.data>b.data)
			return sortedIntersect(b.next, a);
		Node temp=a;
		temp.data=a.data;
		temp.next=sortedIntersect(a.next, b.next);
		return temp;
	}
	public void push(int data){
		Node node = new Node(data);
		node.next=head;
		head=node;
	}
	static void printList(Node head){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String args[])
    {
		IntersectionSortedLL llist1 = new IntersectionSortedLL();
		IntersectionSortedLL llist2 = new IntersectionSortedLL();
	
		//IntersectionSortedLL intersection = new IntersectionSortedLL();
 Node intersection=null;
        /*create a linked list 10->15->4->20 */
        llist1.push(6);
        llist1.push(5);
        llist1.push(4);
        llist1.push(3);
        llist1.push(2);
        llist1.push(1);
        /*create a linked list 8->4->2->10 */
        llist2.push(8);
        llist2.push(6);
        llist2.push(4);
        llist2.push(2);
 
       
      
 
        System.out.println("First List is");
        printList(llist1.head);
 
        System.out.println("Second List is");
        printList(llist2.head);
        intersection = sortedIntersect(llist1.head,llist2.head);
        System.out.println("Intersection List is");
        printList(intersection);
 
    }     
}
