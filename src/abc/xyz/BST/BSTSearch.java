package abc.xyz.BST;

public class BSTSearch {
	Node root;
	 Node search(Node node, int data){
		 if(node == null || node.data == data)
			 return node;
		 
		 if(data < node.data)
			return search(node.left, data);
		 else
			return search(node.right, data);
		 
	 }
	Node insertRec(Node node, int data){
		if(node == null){
			node = new Node(data);
			return node;
		}
		if(data < node.data)
			node.left = insertRec(node.left, data);
		else if(data > node.data)
			node.right = insertRec(node.right, data);
		return node;
	}
	
	void insert(int data){
		root = insertRec(root, data);
	}
	 void inorder(Node root) {
	        if (root != null) {
	            inorder(root.left);
	            System.out.print(root.data+" ");
	            inorder(root.right);
	        }
	    }
	 
	    // Driver Program to test above functions
	    public static void main(String[] args) {
	    	BSTSearch tree = new BSTSearch();
	 
	        /* Let us create following BST
	              50
	           /     \
	          30      70
	         /  \    /  \
	       20   40  60   80 */
	        tree.insert(50);
	        tree.insert(30);
	        tree.insert(20);
	        tree.insert(40);
	        tree.insert(70);
	        tree.insert(60);
	        tree.insert(80);
	 
	        // print inorder traversal of the BST
	        tree.inorder(tree.root);
	        System.out.println("");
	        int data = 30;
	        Node n = tree.search(tree.root, data);
	        if(n.data == data){
	        	System.out.println("Found given key");
	        }
	        else 
	        	System.out.println("Node found");
	            
	    }
}
