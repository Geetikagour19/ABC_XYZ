package abc.xyz.LinkedList;

public class RearrangeNodes {

	static Node head;
	void printlist(Node head){
		if(head==null)
			return;
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	Node reverselist(Node node) {
        Node prev = null, curr = node, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
	}
	void rearrange(Node node){
		Node slow=node;
		Node fast=slow.next;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		Node node1=node;
		Node node2=slow.next;
		slow.next=null;
		
		node2= reverselist(node2);
		
		node = new Node(0);
		Node curr=node;
		while(node1!=null || node2!=null){
			if(node1!=null){
				curr.next=node1;
				curr=curr.next;
				node1=node1.next;
			}
			if(node2!=null){
				curr.next=node2;
				curr=curr.next;
				node2=node2.next;
			}
		}
		node=node.next;
	}
	public static void main(String[] args) {
		 
		RearrangeNodes list = new RearrangeNodes();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
 
        list.printlist(head); // print original list
        list.rearrange(head); // rearrange list as per ques
        System.out.println("");
        list.printlist(head); // print modified list
 
    }
}
