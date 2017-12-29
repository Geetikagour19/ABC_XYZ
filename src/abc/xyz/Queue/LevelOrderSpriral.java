package abc.xyz.Queue;
class Node{
	int data;
	Node left, right;
	Node(int data){
		this.data=data;
		left=right=null;
	}
}
public class LevelOrderSpriral {

	Node root;
	int height(Node node){
		if(node==null)
			return 0;
		int left = height(node.left);
		int right = height(node.right);
		
		return (left>right?left+1:right+1);
	}
	void printSpiral(Node node){
		int h = height(node);
		int i;
		boolean ltr = false;
		for(i=1;i<=h;i++){
			printGivenLevel(node, i, ltr);
			ltr=!ltr;
		}
	}
	
	void printGivenLevel(Node node, int level, boolean ltr){
		if(node == null) return;
		if(level == 1) 
			System.out.print(node.data+" ");
		else if(level>1){
			if(ltr !=false){
				printGivenLevel(node.left, level-1,ltr);
				printGivenLevel(node.right, level-1, ltr);
				
			}else{
				printGivenLevel(node.right, level-1,ltr);
				printGivenLevel(node.left, level-1, ltr);
			}
		}
	}
	 public static void main(String[] args) 
	    {
		 LevelOrderSpriral tree = new LevelOrderSpriral();
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(7);
	        tree.root.left.right = new Node(6);
	        tree.root.right.left = new Node(5);
	        tree.root.right.right = new Node(4);
	        System.out.println("Spiral order traversal of Binary Tree is ");
	        tree.printSpiral(tree.root);
	    }
}
