package abc.xyz.binarytree;

import java.util.Stack;

public class IterativePostorder {
Node root;

 void postOrderIterative(){
	if(root==null)
		return;
	Stack<Node> s1 = new Stack<Node>();
	Stack<Node> s2 = new Stack<Node>();
	
	s1.push(root);
	while(!s1.isEmpty()){
		Node temp=s1.pop();
		s2.push(temp);
		
		if(temp.left!=null)
			s1.push(temp.left);
		if(temp.right!=null)
			s1.push(temp.right);
	}
	
	while(!s2.isEmpty()){
		Node temp=s2.pop();
		System.out.print(temp.data +" " );
	}
	
}

	public static void main(String[] args) 
    {
        // Let us construct the tree 
        // shown in above figure
		IterativePostorder tree = new IterativePostorder();   
        //node root = null;
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
 
        tree.postOrderIterative();
    }
}
