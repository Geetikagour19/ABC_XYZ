package abc.xyz.binarytree;

public class DoubleTree {

	Node root;
	
	void doubleTree(Node node){
		Node oldLeft;
		
		if(node == null)
			return ;
		doubleTree(node.left);
		doubleTree(node.right);
		
		oldLeft = node.left;
		node.left = new Node(node.data);
		node.left.left = oldLeft;
	}
	
	void printInorder(Node node){
		if(node == null)
			return ;
		printInorder(node.left);
		System.out.print(node.data + " ");
		printInorder(node.right);
	}
	
	public static void main(String args[]) 
    {
        /* Constructed binary tree is
              1
            /   \
           2     3
         /  \
        4    5
        */
		DoubleTree tree = new DoubleTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
  
        System.out.println("Original tree is : ");
        tree.printInorder(tree.root);
        tree.doubleTree(tree.root);
        System.out.println("");
        System.out.println("Inorder traversal of double tree is : ");
        tree.printInorder(tree.root);
    }
}
