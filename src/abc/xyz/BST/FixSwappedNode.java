package abc.xyz.BST;

public class FixSwappedNode {
 Node first, last, middle, prev;
 
 void correctBSTUtil(Node node){
	 if(node != null){
		 correctBSTUtil(node.left);
		 
		 if(prev != null && node.data < prev.data){
			 
			 if(first == null){
				 first = prev;
				 middle = node;
			 }else
				 last = node;
		 }
		 prev = node;
		 correctBSTUtil(node.right);
	 }
 }
 	 
	   void correctBST(Node node){
		   first = last = middle = prev = null;
		   correctBSTUtil(node);
		   
		   if(first !=null && last != null){
			   int temp = first.data;
			   first.data = last.data;
			   last.data = temp;
		   }
		   
		   if(first !=null && middle !=null){
			   int temp = first.data;
			   first.data = middle.data;
			   middle.data = temp;
		   }
	   }
	   void printInorder(Node node)
	    {
	        if (node == null)
	            return;
	        printInorder(node.left);
	        System.out.print(" " + node.data);
	        printInorder(node.right);
	    }
	 
	 
	    // Driver program to test above functions
	    public static void main (String[] args) 
	    {
	        /*   6
	            / \
	           10  2
	          / \ / \
	         1  3 7 12
	         
	        10 and 2 are swapped
	        */
	 
	        Node root = new Node(6);
	        root.left = new Node(10);
	        root.right = new Node(2);
	        root.left.left = new Node(1);
	        root.left.right = new Node(3);
	        root.right.right = new Node(12);
	        root.right.left = new Node(7);
	 
	        System.out.println("Inorder Traversal"+
	                        " of the original tree");
	        FixSwappedNode tree = new FixSwappedNode();
	        tree.printInorder(root);
	 
	        tree.correctBST(root);
	 
	        System.out.println("\nInorder Traversal"+
	                          " of the fixed tree");
	        tree.printInorder(root);
	    }
}
