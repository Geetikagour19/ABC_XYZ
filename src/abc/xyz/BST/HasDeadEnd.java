package abc.xyz.BST;

public class HasDeadEnd {

	static Node root;
	
	boolean hasDeadEnd(Node node, int min, int max){
		
		if(node == null)
			return false;
		if(node.left != null || node.right != null)
			return hasDeadEnd(node.left, min, node.data-1) || hasDeadEnd(node.right, node.data+1, max);
		if(max - min > 0)
			return false;
		return true;
			
	}
	
	Node insertRec(Node node, int data){
		if(node == null)
			return new Node(data);
		if(data < node.data)
			node.left = insertRec(node.left, data);
		else if(data > node.data)
			node.right = insertRec(node.right, data);
		return node;
	}
	void insert(int data){
	 root = insertRec(root, data);
	}
	public static void main(String[] args)
	{
		HasDeadEnd tree = new HasDeadEnd();
	    
	    tree.insert(8);
	    tree.insert(5);
	    tree.insert(2);
	    tree.insert(3);
	    tree.insert(7);
	    tree.insert(11);
	    tree.insert(4);
	    	 
	if(tree.hasDeadEnd(root, Integer.MIN_VALUE, Integer.MAX_VALUE)==true)
		System.out.println("Exist");
	else
		System.out.println("Not exist");
	}
}
