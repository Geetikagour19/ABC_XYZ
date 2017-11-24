package abc.xyz.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderWith2Q {
 Node root;
	static void levelOrder(Node node){
		
		Queue<Node> q1 = new  LinkedList<Node>();
		Queue<Node> q2 = new  LinkedList<Node>();
		
		q1.add(node);
		
		while(!q1.isEmpty() || !q2.isEmpty()){
			while(!q1.isEmpty()){
				System.out.print(q1.peek().data + " ");
				if(q1.peek().left!=null)
					q2.add(q1.peek().left);
				if(q1.peek().right!=null)
					q2.add(q1.peek().right);
				
				q1.remove();
			}
			System.out.println();
			while(!q2.isEmpty()){
				System.out.print(q2.peek().data + " ");
				if(q2.peek().left!=null)
					q1.add(q2.peek().left);
				if(q2.peek().right!=null)
					q1.add(q2.peek().right);
				
				q2.remove();
			}
			System.out.println();
		}
		
		
		
		
	}
	
	public static void main(String[] args)
    {
 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
 
        levelOrder(root);
    }
}
