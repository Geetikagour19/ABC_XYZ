package abc.xyz.BST;
class Sum{
	int sum = 0;
}
public class ConstructTree_AddGreaterKey {

	Sum sum = new Sum();
	Node root;
	
	void addGreaterUtil(Node node, Sum sum_ptr){
		if(node == null) return;
		
		addGreaterUtil(node.right, sum_ptr);
		
		sum_ptr.sum += node.data;
		node.data = sum_ptr.sum;
		
		addGreaterUtil(node.left, sum_ptr);
	}
	Node addGreater(Node node){
		addGreaterUtil(node, sum);
		return node;
	}
	 void printInorder(Node node) {
	        if (node == null) {
	            return;
	        }
	        printInorder(node.left);
	        System.out.print(node.data + " ");
	        printInorder(node.right);
	    }
	 
	    // Driver program to test the above functions
	    public static void main(String[] args) {
	    	ConstructTree_AddGreaterKey tree = new ConstructTree_AddGreaterKey();
	        tree.root = new Node(5);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(13);
	 
	        System.out.println("Inorder traversal of given tree ");
	        tree.printInorder(tree.root);
	        Node node = tree.addGreater(tree.root);
	        System.out.println("");
	        System.out.println("Inorder traversal of modified tree ");
	        tree.printInorder(node);
	    }
}
