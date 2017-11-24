package abc.xyz.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class Iterative_Height {

	Node root;
	
	int treeHeight(Node node){
		if(node == null)
			return 0;
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(node);
		
		int height = 0;
		
		while(true){
			
			int  count = q.size();
			if(count == 0){
			return height;
		}
		height++;
		
		while(count > 0){
			Node temp = q.peek();
			q.remove();
			if(temp.left != null)
				q.add(temp.left);
			if(temp.right != null)
				q.add(temp.right);
			count--;
		}
	  }	
	}
	public static void main(String args[]) 
    {
		Iterative_Height tree = new Iterative_Height();
         
        // Let us create a binary tree shown in above diagram
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Height of tree is " + tree.treeHeight(tree.root));
    }
}
