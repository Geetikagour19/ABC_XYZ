package abc.xyz.BST;

public class IsBST_2 {

	Node root, prev;
	boolean isBSTUtil(Node node){
		if(node !=null){
			if(!isBSTUtil(node.left))
				return false;
			if(prev != null && node.data <= prev.data)
				return false;
			prev = node;
			return isBSTUtil(node.right);
		}
		return true;	

		
	}
	
	boolean isBST(){
		prev = null;
		return isBSTUtil(root);
	}
	 public static void main(String args[])
	    {
		 IsBST_2 tree = new IsBST_2();
	        tree.root = new Node(4);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(5);
	        tree.root.left.left = new Node(1);
	        tree.root.left.right = new Node(3);
	 
	        if (tree.isBST())
	            System.out.println("IS BST");
	        else
	            System.out.println("Not a BST");
	    }
}
