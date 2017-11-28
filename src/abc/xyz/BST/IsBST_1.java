package abc.xyz.BST;

public class IsBST_1 {

	Node root;
	
	boolean isBSTUtil(Node node, int min, int max){
		if(node==null)
			return true;
		if(node.data < min || node.data > max)
			return false;
		return isBSTUtil(node.left, min, node.data-1) && isBSTUtil(node.right, node.data+1, max);
	}
	
	boolean isBST(){
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	 public static void main(String args[])
	    {
		 IsBST_1 tree = new IsBST_1();
	        tree.root = new Node(4);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(5);
	        tree.root.left.left = new Node(1);
	        tree.root.left.right = new Node(3);
	 
	        if (tree.isBST())
	            System.out.println("IS BST");
	        else
	            System.out.println("Not a BST");
	    }
}
