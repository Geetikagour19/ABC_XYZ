package abc.xyz.binarytree;

public class TreePathSum {

	Node root;
	int treePathsSum(Node node){
		return  treePathsSumUtil(node, 0);
	}
	
	int treePathsSumUtil(Node node, int x){
		if(node == null)
			return 0;
		
		x = x*10+ node.data;
		
		if(node.left == null && node.right == null)
			return x;
		
		return treePathsSumUtil(node.left, x) + treePathsSumUtil(node.right, x);
	}
	
	 public static void main(String args[]) 
	    {
		 TreePathSum tree = new TreePathSum();
	        tree.root = new Node(6);
	        tree.root.left = new Node(3);
	        tree.root.right = new Node(5);
	        tree.root.right.right = new Node(4);
	        tree.root.left.left = new Node(2);
	        tree.root.left.right = new Node(5);
	        tree.root.left.right.right = new Node(4);
	        tree.root.left.right.left = new Node(7);
	          
	        System.out.print("Sum of all paths is " + 
	                                 tree.treePathsSum(tree.root));   
	    }    
}
