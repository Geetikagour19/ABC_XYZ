package abc.xyz.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {

	Node  root;
	
	void reverseLevelOrder(Node node){
		
		if(node==null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		Stack<Node> s = new Stack<Node>();
		q.add(node);
		while(!q.isEmpty()){
			node=q.peek();
			q.remove();
			s.push(node);
			
			if(node.right!=null)
				q.add(node.right);
			if(node.left!=null)
				q.add(node.left);
						
		}
		while(!s.isEmpty()){
			Node temp=s.peek();
			System.out.print(temp.data+" ");
			s.pop();
		}
	}
	public static void main(String args[]) 
    {
		ReverseLevelOrder tree = new ReverseLevelOrder();
  
        // Let us create trees shown in above diagram
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
  
        System.out.println("Level Order traversal of binary tree is :");
        tree.reverseLevelOrder(tree.root);
  
    }
}
