package abc.xyz.binarytree;

public class ToSumTree {

	Node root;
	
	int  toSumTree(Node node){
		if(node==null) return 0;
		int old_val = node.data;
		node.data = toSumTree(node.left)+ toSumTree(node.right);
		return node.data+old_val;
		//return node.data+toSumTree(node.left)+ toSumTree(node.right);
	}
	void printInorder(Node node) 
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
  
    /* Driver function to test above functions */
    public static void main(String args[]) 
    {
    	ToSumTree tree = new ToSumTree();
  
        /* Constructing tree given in the above figure */
        tree.root = new Node(10);
        tree.root.left = new Node(-2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(-4);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(5);
  
        tree.toSumTree(tree.root);
  
        // Print inorder traversal of the converted tree to test result 
        // of toSumTree()
        System.out.println("Inorder Traversal of the resultant tree is:");
        tree.printInorder(tree.root);
    }
}
