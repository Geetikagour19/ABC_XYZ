package abc.xyz.binarytree;

public class NodeWIthSumOfLeftSubTree {

	Node root;
	int toSumLeftSubTree(Node node){
		if(node==null) return 0;
		if(node.left == null && node.right==null)
			return node.data;
		int leftsum = toSumLeftSubTree(node.left);
		int rightsum = toSumLeftSubTree(node.right);
		
		node.data +=leftsum;
		
		return node.data+rightsum;
	}
	void printInorder(Node node) 
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
	public static void main(String args[]) 
    {
		NodeWIthSumOfLeftSubTree tree = new NodeWIthSumOfLeftSubTree();
  
        /* Constructing tree given in the above figure */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        //tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(6);
  
        tree.toSumLeftSubTree(tree.root);
  
        // Print inorder traversal of the converted tree to test result 
        // of toSumTree()
        System.out.println("Inorder Traversal of the resultant tree is:");
        tree.printInorder(tree.root);
    }
}
