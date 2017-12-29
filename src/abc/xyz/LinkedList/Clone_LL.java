package abc.xyz.LinkedList;

import java.util.HashMap;

import java.util.Map;

public class Clone_LL {
Node head;
   public Clone_LL(Node head){
	   this.head=head;
   }
	public Clone_LL clone(){
		Node orgNode=head, cloneNode = null;
		Map<Node, Node> map= new HashMap<Node, Node>();
		while(orgNode!=null){
			cloneNode = new Node(orgNode.data);
			map.put(orgNode, cloneNode);
			orgNode = orgNode.next;
			
		}
		orgNode = head;
		while(orgNode!=null){
			cloneNode=map.get(orgNode);
			cloneNode.next=map.get(orgNode.next);
			cloneNode.random=map.get(orgNode.random);
			orgNode=orgNode.next;
		}
		
		return new Clone_LL(map.get(head));
	}

	public void push(int data){
		Node node = new Node(data);
		node.next=this.head;
		this.head=node;
	}
	
	void print(){
		Node temp=head;
		while(temp!=null){
			Node random = temp.random;
			int  randomData=(random!=null?random.data:-1);
			System.out.println("Data =" + temp.data + "  :  Random ="+randomData);
			temp=temp.next;
		}
	}
	public static void main(String[] args)
    {
        // Pushing data in the linked list.
		Clone_LL list = new Clone_LL(new Node(5));
		//list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
 
        // Setting up random references.
        list.head.random = list.head.next.next;
        list.head.next.random =
            list.head.next.next.next;
        list.head.next.next.random =
            list.head.next.next.next.next;
        list.head.next.next.next.random =
            list.head.next.next.next.next.next;
        list.head.next.next.next.next.random =
            list.head.next;
 
        // Making a clone of the original linked list.
        Clone_LL clone = list.clone();
 
        // Print the original and cloned linked list.
        System.out.println("Original linked list");
        list.print();
        System.out.println("\nCloned linked list");
        clone.print();
    }
}
