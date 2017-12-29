package abc.xyz.BST;

class Int {
	int c;
}

public class GetCountSubTreeBST {

	Node root;

	boolean inRange(Node node, int low, int high) {
		return node.data >= low && node.data <= high;
	}

	boolean getCountUtil(Node node, int low, int high, Int c) {
		if (node == null)
			return true;
		boolean l = (node.left != null) ? getCountUtil(node.left, low, high, c) : true;
		// System.out.print(l);
		boolean r = (node.right != null) ? getCountUtil(node.right, low, high, c) : true;

		//System.out.println("$$ " + node.data + " " + low + " " + high + " " + c.c); 
		if (l && r && inRange(node, low, high)) {
		//	System.out.println("** " + node.data + " " + low + " " + high + " " + c.c);  
			++c.c;
			return true;
		}
		return false;
	}

	int getCount(Node node, int low, int high) {
		Int c = new Int();
		getCountUtil(node, low, high, c);
		return c.c;
	}

	public static void main(String[] args) {
		GetCountSubTreeBST tree = new GetCountSubTreeBST();
		//GetCountSubTreeBST x = new GetCountSubTreeBST();
		tree.root = new Node(10);
		tree.root.left = new Node(5);
		tree.root.right = new Node(50);
		tree.root.left.left = new Node(1);
		tree.root.right.left = new Node(40);
		tree.root.right.right = new Node(100);
		/*
		 * Let us constructed BST shown in above example 10 / \ 5 50 / / \ 1 40
		 * 100
		 */
		int l = 5;
		int h = 45;
		System.out.println("Count of subtree between [" + l + ", " + h + "] is " + tree.getCount(tree.root, l, h));
	}
}
