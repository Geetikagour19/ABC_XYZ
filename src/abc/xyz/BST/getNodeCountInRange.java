package abc.xyz.BST;

public class getNodeCountInRange {

	Node root;
	
	int getCount(Node node, int low, int high){
		if(node == null)
			return 0;
		if(node.data >=low && node.data<=high)
			return 1+getCount(node.left, low, high)+getCount(node.right, low, high);
		else if(node.data < low)
			return getCount(node.right, low, high);
		else
			return getCount(node.left, low, high);
	}
	 public static void main(String[] args) {
		 getNodeCountInRange tree = new getNodeCountInRange();
	         
	        tree.root = new Node(10);
	        tree.root.left     = new Node(5);
	        tree.root.right     = new Node(50);
	        tree.root.left.left = new Node(1);
	        tree.root.right.left = new Node(40);
	        tree.root.right.right = new Node(100);
	        /* Let us constructed BST shown in above example
	          10
	        /    \
	      5       50
	     /       /  \
	    1       40   100   */
	    int l=5;
	    int h=45;
	    System.out.println("Count of nodes between [" + l + ", "
	                      + h+ "] is " + tree.getCount(tree.root,
	                                                  l, h));
	    }
}
