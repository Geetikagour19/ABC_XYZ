package abc.xyz.binarytree;

public class SumOfLeftLeaves {

	Node root;
	
	boolean isLeaf(Node node){
		if(node == null)
			return false;
		if(node.left== null && node.right==null)
			return true;
		return false;
	}
	
	int leftLeavesSum(Node node){
		int res = 0;
		if(node != null)
		{
			if(isLeaf(node.left))
				res +=node.left.data;
			else
				res +=leftLeavesSum(node.left);
			res +=leftLeavesSum(node.right);
		}
		return res;
	}
	public static void main(String args[]) 
    {
		SumOfLeftLeaves tree = new SumOfLeftLeaves();
        tree.root = new Node(20);
        tree.root.left = new Node(9);
        tree.root.right = new Node(49);
        tree.root.left.right = new Node(12);
        tree.root.left.left = new Node(5);
        tree.root.right.left = new Node(23);
        tree.root.right.right = new Node(52);
        tree.root.left.right.right = new Node(12);
        tree.root.right.right.left = new Node(50);
  
        System.out.println("The sum of leaves is " + 
                                       tree.leftLeavesSum(tree.root));
    }
}