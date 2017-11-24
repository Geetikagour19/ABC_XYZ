package abc.xyz.binarytree;

public class LeftView {

	Node root;
	
	static int maxlevel = 0;
	void leftView(){
		leftViewUtil(root, 1);
	}
	
	void leftViewUtil(Node node, int level){
		if(node == null) return ;
		
		if(maxlevel < level){
			System.out.print(node.data + " ");
			maxlevel = level;
		}
		
		leftViewUtil(node.left, level+1);
		leftViewUtil(node.right, level+1);
	}
	public static void main(String args[])
    {
        /* creating a binary tree and entering the nodes */
		LeftView tree = new LeftView();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);
 
        tree.leftView();
    }
}
