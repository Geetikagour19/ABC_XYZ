package abc.xyz.binarytree;

import java.util.Stack;

public class InOrderWithoutRecursion {
 Node root;
 
 void inorder(){
		if(root==null)
			return;
		Stack<Node> s = new Stack<Node>();
		Node node = root;
		while(node!=null)
		{
			s.push(node);
			node=node.left;
		}
		
		while(s.size()>0){
			node=s.pop();
			System.out.print(node.data + " ");
			if(node.right!=null){
			node=node.right;
			
			while(node!=null)
			{
				s.push(node);
				node=node.left;
			}
		}
	}
}
	public static void main(String args[]) {
        
		
        /* creating a binary tree and entering 
         the nodes */
		InOrderWithoutRecursion tree = new InOrderWithoutRecursion();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.inorder();
    }
}
