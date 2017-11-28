package abc.xyz.BST;
class LNode{
	int d;
	LNode next, prev;
	LNode(int d){
		this.d = d;
		next=prev = null;
	}
}


public class SortedListToBalancedBST {

	Node root;
	LNode head;
	Node sortedListToBSTUtil(int n){
		if(n <= 0)
			return null;
		Node left = sortedListToBSTUtil(n/2);
		
		Node root = new Node(head.d);
		root.left = left;
		
		head = head.next;
		
		root.right = sortedListToBSTUtil(n-n / 2-1);
		
		return root;
	}
	Node sortedListToBST(){
		int n = countNode(head);
		return sortedListToBSTUtil(n);
	}

	int countNode(LNode head){
		int count =0;
		LNode temp = head;
		while(temp !=  null){
			temp=temp.next;
			count++;
		}
		return count;	
	}
	void push(int data){
		LNode new_node = new LNode(data);
		new_node.prev = null;
		new_node.next = head;
		if(head != null){
			head.prev = new_node;
			
		}
		head=new_node;
		
	}
	void printList(LNode head){
		if(head == null)
			return;
		while(head!=null){
			System.out.print(head.d +" " );
		head = head.next;}
	}
	void preOrder(Node node) 
    {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
 
    /* Drier program to test above functions */
    public static void main(String[] args) {
    	SortedListToBalancedBST llist = new SortedListToBalancedBST();
 
        /* Let us create a sorted linked list to test the functions
           Created linked list will be 7->6->5->4->3->2->1 */
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
 
        System.out.println("Given Linked List ");
        llist.printList(llist.head);
 
        /* Convert List to BST */
        Node root = llist.sortedListToBST();
        System.out.println("");
        System.out.println("Pre-Order Traversal of constructed BST ");
        llist.preOrder(root);
    }
	
}
