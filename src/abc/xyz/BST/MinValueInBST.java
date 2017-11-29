package abc.xyz.BST;

public class MinValueInBST {

	Node insert(Node node, int data){
		if(node == null)
			return new Node(data);
		
		if(node.data > data)
				node.left = insert(node.left, data);
		else
				node.right = insert(node.right, data);
		return node;
	}
	
	int minvalue(Node node){
		Node temp = node;
		while(temp.left!=null){
			temp=temp.left;
		}
		return temp.data;
	}
	 public static void main(String[] args) {
		 MinValueInBST tree = new MinValueInBST();
	        Node root = null;
	        root = tree.insert(root, 4);
	        tree.insert(root, 2);
	        tree.insert(root, 1);
	        tree.insert(root, 3);
	        tree.insert(root, 6);
	        tree.insert(root, 5);
	 
	        System.out.println("The minimum value of BST is " + tree.minvalue(root));
	    }
}
