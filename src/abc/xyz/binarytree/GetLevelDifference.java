package abc.xyz.binarytree;
//Difference between sums of odd level and even level nodes of a Binary Tree
public class GetLevelDifference {

	Node root;
	
	int getLevelDiff(Node node){
		if(node == null)
			return 0;
		return node.data - getLevelDiff(node.left) - getLevelDiff(node.right);
	}
	public static void main(String args[]) 
    {
		GetLevelDifference tree = new GetLevelDifference();
        tree.root = new Node(5);
        tree.root.left = new Node(2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(4);
        tree.root.left.right.left = new Node(3);
        tree.root.right.right = new Node(8);
        tree.root.right.right.right = new Node(9);
        tree.root.right.right.left = new Node(7);
        System.out.println(tree.getLevelDiff(tree.root) +  
                                             " is the required difference");
  
    }
}
