package abc.xyz.binarytree;

public class MinimumDepth {

	Node root;
	
	int minimumDepth(Node node){
		if(node == null)
			return 0;
		if(node.left == null && node.right == null)
			return 1;
		if(node.left == null)
			return minimumDepth(node.right)+1;
		if(node.right == null)
			return minimumDepth(node.left)+1;
		return Math.min(minimumDepth(node.left), minimumDepth(node.right))+1;
	}
	int minimumDepth(){
		return minimumDepth(root);
	}
	public static void main(String args[])
    {
		MinimumDepth tree = new MinimumDepth();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println("The minimum depth of "+
          "binary tree is : " + tree.minimumDepth());
    }
}
