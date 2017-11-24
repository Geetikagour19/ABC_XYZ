package abc.xyz.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth {

	Node root;
	
	static int maxwidth(Node node){
		int maxwidth = 0;
		
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(node);
		while(!q.isEmpty()){
		int count = q.size();
		
		maxwidth = Math.max(maxwidth, count);
		
		while(count-- > 0){
			Node temp = q.remove();
			if(temp.left != null)
				q.add(temp.left);
			if(temp.right != null)
				q.add(temp.right);
		}
		}
		return maxwidth;
	}
	public static void main(String[] args) 
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(8);
        root.right.right.left = new Node(6);
        root.right.right.right = new Node(7);
 
                /*   Constructed Binary tree is:
                1
              /   \
            2      3
          /  \      \
         4    5      8
                   /   \
                  6     7    */
                   
        System.out.println("Maximum width = " + maxwidth(root));
    }
}
