package abc.xyz.binarytree;

public class InorderSuccesor {

	Node root ;
	static Node next = null;
	
	void populateNext(Node node){
		populateNextRecur(node);
	}
	
	void populateNextRecur(Node node){
		
		if(node !=null){
			populateNextRecur(node.right);
			
			node.next = next;
			next = node;
			
			populateNextRecur(node.left);
			
		}
	}
	public static void main (String args[])
	{
        /* Constructed binary tree is
            10
           /   \
          8      12
         /
        3    */
		InorderSuccesor tree = new InorderSuccesor();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(12);
        tree.root.left.left = new Node(3);
  
        // Populates nextRight pointer in all nodes
        tree.populateNext(tree.root);
  
        // Let us see the populated values
        Node ptr = tree.root.left.left;
        while (ptr != null) 
        {
            // -1 is printed if there is no successor
            int print = ptr.next != null ? ptr.next.data : -1;
            System.out.println("Next of " + ptr.data + " is: " + print);
            ptr = ptr.next;
        }
    }
}
