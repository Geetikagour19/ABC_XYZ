package abc.xyz.binarytree;

public class PrintAncestors {
Node root;

boolean printAncestor(Node node, int x){
	if(node==null){
		return false;
	}
	
	if(node.data == x)
		return true;
	
	if(printAncestor(node.left, x) || printAncestor(node.right, x)){
		System.out.print(node.data +" ");
		return true;
	}
	return false;
}
	
	public static void main(String args[]) 
    {
		PrintAncestors tree = new PrintAncestors();
         
        /* Construct the following binary tree
                  1
                /   \
               2     3
              /  \
             4    5
            /
           7
        */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(7);
  
        tree.printAncestor(tree.root, 7);
  
    }
}
