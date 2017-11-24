package abc.xyz.binarytree;

public class DeleteTre {

	static Node root;
	
	void deleteTree(Node node){
		if(node==null)
			return ;
		deleteTree(node.left);
		deleteTree(node.right);
		
		System.out.println("Deleted node : " + node.data);
		node=null;
	}
	public static void main(String[] args)
    {
  
		DeleteTre tree = new DeleteTre();
  
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
  
        /* Note that we pass root node here */
        tree.deleteTree(root);
        System.out.println("Tree deleted");
  
    }
}
