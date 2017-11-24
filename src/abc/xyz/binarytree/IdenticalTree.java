package abc.xyz.binarytree;

public class IdenticalTree {

	Node root1, root2;
	
	boolean areIdentical(Node a , Node b){
		if(a==null && b==null)
			return true;
		if(a==null || b == null)
			return false;
		return (a.data==b.data && areIdentical(a.left, b.left) && areIdentical(a.right, b.right));
	}
	public static void main(String[] args) 
    {
		IdenticalTree tree = new IdenticalTree();
  
        tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);
  
        tree.root2 = new Node(1);
        tree.root2.left = new Node(2);
        tree.root2.right = new Node(3);
        tree.root2.left.left = new Node(4);
        tree.root2.left.right = new Node(5);
  
        if (tree.areIdentical(tree.root1, tree.root2))
            System.out.println("Both trees are identical");
        else
            System.out.println("Trees are not identical");
  
    }
}
