package abc.xyz.binarytree;

class Height{
	int height =0;
}
public class CheckBalanceBinaryTree {

	Node root;
	
	boolean isBalanced(Node node, Height height){
		if(node == null){
			height.height =0;
			return true;
		}
		Height lheight = new Height(), rheight = new Height();
		
		boolean l = isBalanced(node.left, lheight);
		boolean r = isBalanced(node.right, rheight);
		
		int lh = lheight.height;
		int rh = rheight.height;
		
		height.height = (lh > rh ? lh : rh) +1;
		
		if((lh-rh > 2 )|| (rh - lh >2))
				return false;
		else return l & r;
		
	}
	
	int height(Node node){
		if(node == null)
			return 0;
		int l = height(node.left);
		int r = height(node.right);
		
		return (l > r ? l+1 : r+1);
	}
	public static void main(String args[])
    {
        Height height = new Height();
 
        /* Constructed binary tree is
                   1
                 /   \
                2      3
              /  \    /
            4     5  6
            /
           7         */
        CheckBalanceBinaryTree tree = new CheckBalanceBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.left.left.left = new Node(7);
 
        if (tree.isBalanced(tree.root, height))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }
}
