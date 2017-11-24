package abc.xyz.binarytree;

public class RemoveShortPathNodes {

	Node root;
	
	Node removeShortPathNodesUtil(Node node, int k , int level){
		if(node == null) return null;
		node.left = removeShortPathNodesUtil(node.left, k, level +1);
		node.right = removeShortPathNodesUtil(node.right, k, level+1);
		
		if(node.left == null && node.right == null && level < k)
			return null;
		return node;
	}
	Node removeShortPathNodes(Node node, int k){
		return removeShortPathNodesUtil(node, k, 1);
	}
	void printInorder(Node node){
		if(node == null) return ;
		printInorder(node.left);
		System.out.print(node.data +" ");
		printInorder(node.right);
	}
	
	 public static void main(String args[]) 
	    {
		 RemoveShortPathNodes tree = new RemoveShortPathNodes();
	        int k = 4;
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.root.left.left.left = new Node(7);
	        tree.root.right.right = new Node(6);
	        tree.root.right.right.left = new Node(8);
	        System.out.println("The inorder traversal of original tree is : ");
	        tree.printInorder(tree.root);
	        Node res = tree.removeShortPathNodes(tree.root, k);
	        System.out.println("");
	        System.out.println("The inorder traversal of modified tree is : ");
	        tree.printInorder(res);
	    }
}
