package abc.xyz.binarytree;

public class RootToLeafPath {

	Node root;
	
	void printPaths(Node node){
		int path[] = new int[1000];
		printPathsRecur(node, path, 0);
	}
	
	void printPathsRecur(Node node, int path[], int pathlen){
		if(node==null) return;
		
		path[pathlen] = node.data;
		pathlen++;
		if(node.left==null && node.right ==null){
			for(int i=0; i<pathlen;i++){
				System.out.print(path[i] + "  ");
				
			}
			System.out.println();
		}
		
		else{
			printPathsRecur(node.left, path, pathlen);
			printPathsRecur(node.right, path, pathlen);
		}

	}
	public static void main(String[] args) 
    {
		RootToLeafPath tree = new RootToLeafPath();
  
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
  
        /* Print all root-to-leaf paths of the input tree */
        tree.printPaths(tree.root);
  
    }
}
