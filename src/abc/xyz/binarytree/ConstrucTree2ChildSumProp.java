package abc.xyz.binarytree;

public class ConstrucTree2ChildSumProp {

	Node root;
	
	void convertTree(Node node){
		
		int left=0, right=0, diff=0;
		
		if(node==null || (node.left ==null && node.right == null))
			return ;
		else{
			convertTree(node.left);
			convertTree(node.right);
			
			if(node.left!=null)
				left = node.left.data;
			if(node.right!=null)
				right = node.right.data;
			
			diff = left+right-node.data;
			
			if(diff>0)
				node.data = node.data+diff;
			if(diff<0)
				increament(node, -diff);
		}
		
	}
	
	void increament(Node node, int diff){
		if(node.left!=null){
			node.left.data = node.left.data+diff;
			increament(node.left, diff);
		}
		else if(node.right!=null){
			node.right.data+=diff;
			increament(node.right, diff);
		}
	}
	
	void printInorder(Node node){
		if(node == null) return ;
		printInorder(node.left);
		System.out.print(node.data + " ");
		printInorder(node.right);
	}
	public static void main(String args[]) 
    {
		ConstrucTree2ChildSumProp tree = new ConstrucTree2ChildSumProp();
        tree.root = new Node(50);
        tree.root.left = new Node(7);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(1);
        tree.root.right.right = new Node(30);
  
        System.out.println("Inorder traversal before conversion is :");
        tree.printInorder(tree.root);
  
        tree.convertTree(tree.root);
        System.out.println("");
  
        System.out.println("Inorder traversal after conversion is :");
        tree.printInorder(tree.root);
  
    }
}
