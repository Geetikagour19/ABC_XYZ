package abc.xyz.binarytree;

public class KDistanceFromLeaf {

	Node root;
	
	void printKDistantfromLeafUtil(Node node, int path[], boolean visited[], int pathlen, int k){
		if(node == null) return ;
		path[pathlen] = node.data;
		visited[pathlen] = false;
		pathlen++;
		
		if(node.left  == null && node.right == null && pathlen-k-1 >=0 && visited[pathlen-k-1]== false){
			
			System.out.print(path[pathlen-k-1] + " ");
			visited[pathlen-k-1] = true;
			return;
		}
		
		printKDistantfromLeafUtil(node.left, path, visited, pathlen, k);
		printKDistantfromLeafUtil(node.right, path, visited, pathlen, k);
	}
	
	void printKDistantfromLeaf(Node node, int k){
		int path[] = new int[1000];
		boolean visited[] = new boolean[1000];
		printKDistantfromLeafUtil(node, path, visited, 0, k);
	}
	
	public static void main(String args[])
    {
		KDistanceFromLeaf tree = new KDistanceFromLeaf();
  
        /* Let us construct the tree shown in above diagram */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);
  
        System.out.println(" Nodes at distance 2 are :");
        tree.printKDistantfromLeaf(tree.root, 2);
    }
}
