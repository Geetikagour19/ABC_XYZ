package abc.xyz.binarytree;

public class CheckCusins {

	Node root;
	boolean isSibling(Node node, Node a, Node b){
		if (node == null)
			return false;
		return ((node.left == a && node.right == b) || (node.left == b && node.right == a)||
				isSibling(node.left, a,b) || isSibling(node.right, a, b));
	}
	
	int level(Node node, Node ptr, int lvl){
		if(node == null)
			return 0;
		if(node == ptr)
			return lvl;
		int l = level(node.left, ptr, lvl + 1);
		if(l!=0)
			return l;
		return level(node.right, ptr, lvl +1);
		
	}
	boolean isCousin(Node node, Node n1, Node n2){
		
		return((level(node, n1, 1)==level(node, n2, 1)) && (!isSibling(node, n1, n2)));
	}
	public static void main(String args[])
    {
		CheckCusins tree = new CheckCusins();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.right = new Node(15);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);
 
        Node Node1, Node2;
        Node1 = tree.root.left.left;
        Node2 = tree.root.right.right;
        if (tree.isCousin(tree.root, Node1, Node2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
