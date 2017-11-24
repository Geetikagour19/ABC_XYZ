package abc.xyz.binarytree;

public class FindDistance {

	static Node findLCA(Node node, int n1, int n2){
		if(node==null)
			return null;
		if(node.data==n1 || node.data==n2)
			return node;
		Node left_lca = findLCA(node.left, n1, n2);
		Node right_lca = findLCA(node.right, n1, n2);
		
		if(left_lca!=null && right_lca!=null)
			return node;
		return (left_lca!=null ? left_lca : right_lca);
	}
	
	static int findLevel(Node node, int k, int level){
		if(node==null)
			return 0;
		if(node.data==k)
			return level;
		int left = findLevel(node.left, k, level+1);
		if(left == 0)
			return findLevel(node.right, k, level+1);
		return left;
	}
	static int findDistance(Node node, int a, int b){
		Node lca= findLCA(node, a, b);
		int d1 = findLevel(lca, a, 0);
		int d2 = findLevel(lca, b, 0);
		return d1+d2;
	}
	public static void main(String[] args) {
        
        // Let us create binary tree given in the above example
        Node  root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        
        System.out.println("Dist(4, 5) = "+findDistance(root, 4, 5));
        System.out.println("Dist(4, 6) = "+findDistance(root, 4, 6));
        System.out.println("Dist(3, 4) = "+findDistance(root, 3, 4));
        System.out.println("Dist(2, 4) = "+findDistance(root, 2, 4));
        System.out.println("Dist(8, 5) = " +findDistance(root, 8, 5));
         
    }
}
