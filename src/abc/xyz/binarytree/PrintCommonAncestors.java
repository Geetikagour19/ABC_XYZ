package abc.xyz.binarytree;

public class PrintCommonAncestors {

	static Node root;
	static Node findLCA(Node node, int n1, int n2){
		if(node==null)
			return null;
		if(node.data == n1 || node.data == n2)
			return node;
		Node left_lca = findLCA(node.left, n1, n2);
		Node right_lca = findLCA(node.right, n1, n2);
		
		if(left_lca !=  null && right_lca != null)
			return node;
		
		return (left_lca != null ? left_lca : right_lca);
	}
	
	static boolean printAncestors(Node node, int d){
		if(node==null)
			return false;
		if(node.data == d){
			System.out.print(node.data +" ");
			return true;
		}
		
		if(printAncestors(node.left, d) || printAncestors(node.right, d)){
			System.out.print(node.data +" ");
			return true;
		}
		return false;	
	}
	
	static boolean findCommonNodes(Node root, int a, int b){
		Node lca = findLCA(root, a, b);
		if(lca==null)
			return false;
		printAncestors(root, lca.data);
		return true;
	}
	
	public static void main(String args[]) 
    {
    /*Let us create Binary Tree shown in 
        above example */
  
		PrintCommonAncestors tree = new PrintCommonAncestors();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.right.left.left = new Node(9);
        tree.root.right.left.right = new Node(10);
  
   if (findCommonNodes(root, 9, 7) == false)
    System.out.println("No Common nodes");
  
    }
}
