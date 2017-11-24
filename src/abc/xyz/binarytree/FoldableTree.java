package abc.xyz.binarytree;

public class FoldableTree {

	Node root;
	boolean IsFoldable(Node node){
		if(node == null)
			return true;
		return isFoldableUtil(node.left, node.right);
	}
	
	boolean isFoldableUtil(Node a, Node b){
		if(a == null && b == null)
			return true;
		if(a == null ||  b == null)
			return false;
		return (isFoldableUtil(a.left, b.right) && isFoldableUtil(a.right, b.left));
	}
	public static void main(String args[]) {
		FoldableTree tree = new FoldableTree();
         
        /* The constructed binary tree is
             1
           /   \
          2     3
           \    /
            4  5
        */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.left.right = new Node(5);
  
        if (tree.IsFoldable(tree.root))
            System.out.println("tree is foldable");
        else
            System.out.println("Tree is not foldable");
  
    }
}
