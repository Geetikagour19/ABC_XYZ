package abc.xyz.LinkedList;

public class MergeLists_Reveres {

	Node head;
	Node a,b;
	
	Node sortedmerge(Node node1, Node node2){
		if(node1==null && node2==null)
			return null;
		Node res=null;
		while(node1!=null && node2!=null){
			if(node1.data<=node2.data){
				Node temp=node1.next;
				node1.next=res;
				res=node1;
				node1=temp;
			}else{
				Node temp=node2.next;
				node2.next=res;
				res=node2;
				node2=temp;
			}
		}
		while(node1!=null){
			Node temp=node1.next;
			node1.next=res;
			res=node1;
			node1=temp;
		}
		
		while(node2!=null){
			Node temp=node2.next;
			node2.next=res;
			res=node2;
			node2=temp;
		}
		return res;
	}
    void printlist(Node node){
		if(node==null)
			return;
		Node temp=node;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		 
		MergeLists_Reveres list = new MergeLists_Reveres();
        Node result = null;
 
        /*Let us create two sorted linked lists to test
         the above functions. Created lists shall be
         a: 5->10->15
         b: 2->3->20*/
        list.a = new Node(5);
        list.a.next = new Node(10);
        list.a.next.next = new Node(15);
 
        list.b = new Node(2);
        list.b.next = new Node(3);
        list.b.next.next = new Node(20);
 
        System.out.println("List a before merge :");
        list.printlist(list.a);
        System.out.println("");
        System.out.println("List b before merge :");
        list.printlist(list.b);
 
        // merge two sorted linkedlist in decreasing order
        result = list.sortedmerge(list.a, list.b);
        System.out.println("");
        System.out.println("Merged linked list : ");
        list.printlist(result);
 
    }
}
