package abc.xyz.binarytree;

import java.util.Vector;

public class ConstructBSTToBalancedBST {

	Node root;
	
	void StoreBSTNodes(Node node, Vector<Node> nodes){
		if(node == null)
			return;
		StoreBSTNodes(node.left, nodes);
		nodes.add(node);
		StoreBSTNodes(node.right, nodes);
	}
	
	Node buildTreeUtil(Vector<Node> nodes, int start, int end){
		if(start>end)
			return null;
		
		int mid = (start+end)/2;
		
		Node node = nodes.get(mid);
		
		node.left = buildTreeUtil(nodes, start, mid-1);
		node.right = buildTreeUtil(nodes, mid+1, end);
		
		return node;
	}
	
	Node buildTree(Node node){
		Vector<Node> nodes = new Vector<Node>();
		StoreBSTNodes(node, nodes);
		
		int n = nodes.size();
		return buildTreeUtil(nodes, 0, n-1);
	}
	void preOrder(Node node) 
    {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
 
    // Driver program to test the above functions
    public static void main(String[] args) 
    {
         /* Constructed skewed binary tree is
                10
               /
              8
             /
            7
           /
          6
         /
        5   */
    	ConstructBSTToBalancedBST tree = new ConstructBSTToBalancedBST();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(7);
        tree.root.left.left.left = new Node(6);
        tree.root.left.left.left.left = new Node(5);
 
        tree.root = tree.buildTree(tree.root);
        System.out.println("Preorder traversal of balanced BST is :");
        tree.preOrder(tree.root);
    }
}
