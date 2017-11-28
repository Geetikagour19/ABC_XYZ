package abc.xyz.BST;

import java.util.ArrayList;

public class Check2BSTsContainsSameNodes {

	Node root1, root2;
	
	void insertToArray(Node node, ArrayList<Integer> a){
		if(node == null)
			return ;
		insertToArray(node.left, a);
		a.add(node.data);
		insertToArray(node.right, a);
	}
	boolean checkBSTs(Node n1, Node n2){
		if(n1 == null && n2 == null)
			return true;
		if((n1 == null || n2 == null))
			return false;
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		insertToArray(n1, a1);
		insertToArray(n2, a2);
		
		for(int i = 0; i < a1.size(); ++i)
		{
			System.out.println( a1.get(i) );
		}
		System.out.println();
		for(int i = 0; i < a2.size(); ++i)
		{
			System.out.println( a2.get(i) );
		}
		System.out.println();
		for(int i = 0; i < a1.size(); ++i)
		{
			System.out.println(a1.get(i) + " " + a2.get(i) );
			int x = a1.get(i);
			int y = a2.get(i);
			if ((x-y) != 0);
			{
				System.out.println(x + " " + y + " " + (x-y) );
				return false;				
			}
		}
		
		return true;
	}
	public static void main(String args[]){
		Check2BSTsContainsSameNodes tree = new Check2BSTsContainsSameNodes();
		tree.root1 = new Node(15);
		tree.root1.left = new Node(10);
		tree.root1.right = new Node(20);
		tree.root1.left.left = new Node(5);
		tree.root1.left.right = new Node(12);
		tree.root1.right.right = new Node(25);
		
		tree.root2 = new Node(15);
		tree.root2.left = new Node(12);
		tree.root2.right = new Node(20);
		tree.root2.left.left = new Node(5);
		tree.root2.left.left.right = new Node(10);
		tree.root2.right.right = new Node(25);
	
		if(tree.checkBSTs(tree.root1, tree.root2))
			System.out.print("yes");
		else
			System.out.print("No");
	}	
}
