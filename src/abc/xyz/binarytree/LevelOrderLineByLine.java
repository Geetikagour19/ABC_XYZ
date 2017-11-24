package abc.xyz.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderLineByLine {
 Node root;
	static void printLevelOrderLineByLine(Node node){
		int h=hight(node);
		for(int i=1; i<=h; i++){
			printGivenLevel(node, i);
			System.out.println();
		}
	}
	
	static void printGivenLevel(Node node, int level){
		if(node==null)
			return;
		if(level==1)
			System.out.print(node.data + " ");
		else if(level > 1){
			printGivenLevel(node.left, level-1);
			printGivenLevel(node.right, level-1);
		}
			
	}
	static int hight(Node node){
		if(node==null)
			return 0;
		int left = hight(node.left);
		int right = hight(node.right);
		return (left > right ? left+1 : right+1);
	}
	
	static void printLevelOrderLineByLine1(Node node){
		if(node==null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(node);
		while(true){
			int count = q.size();
			if(count==0)
				break;
			while(count>0){
				Node temp = q.peek();
				System.out.print(temp.data +" ");
				q.remove();
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
				count--;
			}
			
			System.out.println();
		}
	}
	
	public static void main(String args[]) 
    {
        /* creating a binary tree and entering 
         the nodes */
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
 
        System.out.println("Level order traversal of binary tree is - ");
        printLevelOrderLineByLine1(root);
}
}