package abc.xyz.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class InterativeSErachForKeyX {

	Node root;
	boolean itrativeSearchForKeyX(Node node, int x){
		if(node == null)
			return false;
		Queue<Node> q = new LinkedList<Node>();
		q.add(node);
		while(!q.isEmpty()){
			Node temp = q.peek();
			if(temp.data == x)
				return true;
			q.remove();
			
			if(temp.left != null)
				q.add(temp.left);
			if(temp.right != null)
				q.add(temp.right);
		}
		
		return false;
	}
	public static void main(String args[])
    {
		InterativeSErachForKeyX tree = new InterativeSErachForKeyX();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        if(tree.itrativeSearchForKeyX(tree.root, 4))
        	System.out.println( "found");
        else
        System.out.print("Not Found");
    }
}
