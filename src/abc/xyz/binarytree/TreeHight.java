package abc.xyz.binarytree;

public class TreeHight {

	Node root;
	
	int height(Node node){
		if(node==null)
			return 0;
		int l = height(node.left);
		int r = height(node.right);
		
		return (l > r ? l+1 : r+1);
	}
	public static void main(String[] args) 
    {
		TreeHight tree = new TreeHight();
  
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
  
        System.out.println("Height of tree is : " + 
                                      tree.height(tree.root));
    }
}
