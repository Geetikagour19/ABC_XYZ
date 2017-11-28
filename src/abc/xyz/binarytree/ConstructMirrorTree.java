package abc.xyz.binarytree;

public class ConstructMirrorTree {

	Node root;
	
	Node mirror(Node node){
		
		if(node==null) return null;
		
		Node left = mirror(node.left);
		Node right = mirror(node.right);
		
		node.left = right;
		node.right = left;
		
		return node;
	}
	
	 void inOrder(Node node)
	    {
	        if (node == null)
	            return;
	 
	        inOrder(node.left);
	        System.out.print(node.data + " ");
	 
	        inOrder(node.right);
	    }
	 
	    /* testing for example nodes */
	    public static void main(String args[])
	    {
	        /* creating a binary tree and entering the nodes */
	    	ConstructMirrorTree tree = new ConstructMirrorTree();
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	 
	        /* print inorder traversal of the input tree */
	        System.out.println("Inorder traversal of input tree is :");
	        tree.inOrder(tree.root);
	        System.out.println("");
	 
	        /* convert tree to its mirror */
	        tree.mirror(tree.root);
	 
	        /* print inorder traversal of the minor tree */
	        System.out.println("Inorder traversal of binary tree is : ");
	        tree.inOrder(tree.root);
	 
	    }
}
