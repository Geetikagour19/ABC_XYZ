package abc.xyz.binarytree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right , next, nextRight;
 
    public Node(int item) {
        data = item;
        left = null;
        right = null;
        next = null;
        nextRight = null;
    }
}

public class LevelOrder {
	Node root;
	
	public void printLevelOrder(){
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			Node temp=q.poll();
			System.out.print(temp.data + " ");
			 if(temp.left!=null)
				 q.add(temp.left);
			 if(temp.right!=null)
				 q.add(temp.right);
		}
	}
	
	public static void main(String args[]) 
    {
        /* creating a binary tree and entering 
         the nodes */
		LevelOrder tree_level = new LevelOrder();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }

}
