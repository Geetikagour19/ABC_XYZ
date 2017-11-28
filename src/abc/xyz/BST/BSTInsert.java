package abc.xyz.BST;

class Node{
	int data;
	Node left, right;
	Node(int data){
		this.data = data;
		left = right = null;
		
	}
}
public class BSTInsert {

	Node root;
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
	    	BSTInsert tree = new BSTInsert();
	 
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
	    }
}
