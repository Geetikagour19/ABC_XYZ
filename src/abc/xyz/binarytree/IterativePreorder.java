package abc.xyz.binarytree;

import java.util.Stack;

public class IterativePreorder {
 Node root;
	void iterativePreorder(){
	 if(root==null)
		 return;
	 Stack<Node> s = new Stack<Node>();
	 s.push(root);
	 while(s.size()!=0){
		 Node temp=s.peek();
		 System.out.print(temp.data + " ");
		 s.pop();
		 if(temp.right!=null)
			 s.push(temp.right);
		 if(temp.left!=null)
			 s.push(temp.left);
	 }
	}
	public static void main(String args[]) {
		IterativePreorder tree = new IterativePreorder();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
        tree.iterativePreorder();
 
    }
}
