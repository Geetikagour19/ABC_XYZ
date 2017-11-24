package abc.xyz.binarytree;

class Max_Level{
	int max_level;
}
public class RightView {

	Node root;
	Max_Level max = new Max_Level();
	
	void rightView(){
		rightViewUtil(root, 1, max);
	}
	
	void rightViewUtil(Node node, int level, Max_Level max_level){
		if(node == null)
		return;
		
		if(max_level.max_level < level){
			System.out.print(node.data + " ");
			max_level.max_level = level;
		}
		
		rightViewUtil(node.right, level+1, max_level);
		rightViewUtil(node.left, level+1, max_level);
	}
	
	 public static void main(String args[]) {
		 RightView tree = new RightView();
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.root.right.left = new Node(6);
	        tree.root.right.right = new Node(7);
	        tree.root.right.left.right = new Node(8);
	         
	        tree.rightView();
	 
	        }
}
