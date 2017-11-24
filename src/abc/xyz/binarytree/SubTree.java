package abc.xyz.binarytree;

public class SubTree {
Node root1, root2;

boolean isSubTree(Node t, Node s){
	if(s==null)
		return true;
	if(t==null)
		return false;
	if(areIdentical(t, s))
		return true;
	return (isSubTree(t.left, s) || isSubTree(t.right, s));
}

boolean areIdentical(Node a, Node b){
	if(a==null && b==null)
		return true;
	if(a==null | b==null)
		return false;
	return (a.data==b.data && areIdentical(a.left, b.left) && areIdentical(a.right, b.right));
}

public static void main(String args[]) 
{
	SubTree tree = new SubTree();
      
    // TREE 1
    /* Construct the following tree
          26
         /   \
        10     3
       /    \     \
      4      6      3
       \
        30  */
       
    tree.root1 = new Node(26);
    tree.root1.right = new Node(3);
    tree.root1.right.right = new Node(3);
    tree.root1.left = new Node(10);
    tree.root1.left.left = new Node(4);
    tree.root1.left.left.right = new Node(30);
    tree.root1.left.right = new Node(6);

    // TREE 2
    /* Construct the following tree
       10
     /    \
     4      6
      \
      30  */
       
    tree.root2 = new Node(10);
    tree.root2.right = new Node(6);
    tree.root2.left = new Node(4);
    tree.root2.left.right = new Node(30);

    if (tree.isSubTree(tree.root1, tree.root2))
        System.out.println("Tree 2 is subtree of Tree 1 ");
    else
        System.out.println("Tree 2 is not a subtree of Tree 1");
}
}
