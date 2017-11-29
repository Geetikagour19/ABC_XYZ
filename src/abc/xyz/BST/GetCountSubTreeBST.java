package abc.xyz.BST;

public class GetCountSubTreeBST {

	Node root;
	boolean inRange(Node node, int low, int high){
		return node.data>=low && node.data<=high;
	}
	boolean getCountUtil(Node node, int low, int high, int c){
		if(node == null)
			return true;
		boolean l = (node.left!=null)?getCountUtil(node.left, low, high, c):true;
		//System.out.print(l);
		boolean r = (node.right!=null)?getCountUtil(node.right, low, high, c):true;
		
		if(l  && r && inRange(node, low, high)){
			++c;
			return true;
		}
		return false;
	}
	int getCount(Node node, int low, int high){
		int count = 0;
		getCountUtil(node, low, high, count);
		return count;
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
	    System.out.println("Count of subtree between [" + l + ", "
	                      + h+ "] is " + tree.getCount(tree.root,
	                                                  l, h));
	    }
}
