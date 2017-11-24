package abc.xyz.com;

class Node{
	int data;
	Node left, right;
	
	public Node(int data){
		this.data=data;
		left=right=null;
	}
}
public class CheckBST {
	Node root;
	Node prev;
	public boolean isBSTUtil(Node node, int min, int max){
		if(node == null)
			return true;
		if(node.data<min || node.data>max)
			return false;
		return (isBSTUtil(node.left, min, node.data-1) && isBSTUtil(node.right, node.data+1, max));
		
	}
	public boolean isBST(){
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public boolean isBST1(Node node){
		if(node!=null){
			if(!isBST1(node.left))
				return false;
			if(prev!=null && node.data<=prev.data)
				return false;
			prev=node;
			return isBST1(node.right);
		}
		return true;
	}
	public boolean isBST1(){
		prev=null;
		return isBST1(root);
	}

	public static void main(String args[]){
		
		CheckBST tree = new CheckBST();
		tree.root=new Node(4);
		tree.root.left = new Node(2);
	    tree.root.right = new Node(5);
	    tree.root.left.left = new Node(1);
	    tree.root.left.right = new Node(3);
	 
	        if (tree.isBST1())
	            System.out.println("IS BST");
	        else
	            System.out.println("Not a BST");
		
		
	}
}
