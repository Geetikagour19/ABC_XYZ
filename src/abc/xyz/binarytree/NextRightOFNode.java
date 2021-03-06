package abc.xyz.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class NextRightOFNode {

	Node root;
	
	Node nextRight(Node node, int k){
		
		if(node == null) return null;
		
		Queue<Node> qn= new LinkedList<Node>();
		Queue<Integer> ql = new LinkedList<Integer>();
		
		int level = 0;
		
		qn.add(node);
		ql.add(level);
		
		while(qn.size() != 0){
			
			Node temp = qn.peek();
			level = ql.peek();
			
			qn.remove();
			ql.remove();
			
			if(temp.data == k){
				if(ql.size() == 0 || ql.peek() != level)
					return null;
				return qn.peek();
			}
			
			if(temp.left != null){
				qn.add(temp.left);
				ql.add(level+1);
			}
			
			if(temp.right != null){
				qn.add(temp.right);
				ql.add(level+1);
			}
		}
		return null;
	}
	void test(Node node, int k){
		
		Node nr = nextRight(node, k);
		
		if(nr != null)
			 System.out.println("Next Right of " + k + " is " + nr.data);
        else
            System.out.println("No next right node found for " + k);
    
	}
	public static void main(String args[]) 
    {
		NextRightOFNode tree = new NextRightOFNode();
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(6);
        tree.root.right.right = new Node(5);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(4);
  
        tree.test(tree.root, 10);
        tree.test(tree.root, 2);
        tree.test(tree.root, 6);
        tree.test(tree.root, 5);
        tree.test(tree.root, 8);
        tree.test(tree.root, 4);
  
    }
}
