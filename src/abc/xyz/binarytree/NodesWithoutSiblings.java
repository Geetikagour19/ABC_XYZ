package abc.xyz.binarytree;

public class NodesWithoutSiblings {

	Node root;
	
	void printSingles(Node node){
		if(node == null)
			return;
		if(node.left != null && node.right != null){
			printSingles(node.left);
			printSingles(node.right);
		}
		else if(node.right != null){
			System.out.print(node.right.data + " ");
			printSingles(node.right);
		}
		else if(node.left != null){
			System.out.print(node.left.data + " ");
			printSingles(node.left);
		}
	}
	public static void main(String args[]) 
    {
		NodesWithoutSiblings tree = new NodesWithoutSiblings();
 
        /* Let us construct the tree shown in above diagram */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(5);
        tree.root.right.left.right = new Node(6);
        tree.printSingles(tree.root);
    }
}
