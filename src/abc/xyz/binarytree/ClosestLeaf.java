package abc.xyz.binarytree;

public class ClosestLeaf {

	Node root;
	int getMin(int x, int y){
		return (x<y ? x:y);
	}
	
	int closedown(Node node){
		if(node == null) return Integer.MAX_VALUE;
		if(node.left == null && node.right == null)
			return 0;
		return 1+ getMin(closedown(node.left), closedown(node.right));
	}
	int findClosestLeafUtil(Node node, char k, Node ancestors[], int index){
		if(node == null) return Integer.MAX_VALUE;
		
		if(node.data ==k){
			int res = closedown(node);
			
			for(int i = index-1; i>=0; i--){
				res = getMin(res, index-i+closedown(ancestors[i]));
				}
			return res;
		}
		
		ancestors[index] = node;
		return getMin(findClosestLeafUtil(node.left, k, ancestors, index+1), findClosestLeafUtil(node.right, k, ancestors, index+1));
		
	}
	
	int findClosestLeaf(Node node, char k){
		Node ancestors[] = new Node [100];
		return findClosestLeafUtil(node, k, ancestors, 0);
	}
	public static void main(String args[]) 
    {
		ClosestLeaf tree = new ClosestLeaf();
        tree.root = new Node('A');
        tree.root.left = new Node('B');
        tree.root.right = new Node('C');
        tree.root.right.left = new Node('E');
        tree.root.right.right = new Node('F');
        tree.root.right.left.left = new Node('G');
        tree.root.right.left.left.left = new Node('I');
        tree.root.right.left.left.right = new Node('J');
        tree.root.right.right.right = new Node('H');
        tree.root.right.right.right.left = new Node('H');
  
        char k = 'H';
        System.out.println("Distace of the closest key from " + k + " is "
                            + tree.findClosestLeaf(tree.root, k));
        k = 'C';
        System.out.println("Distace of the closest key from " + k + " is "
                            + tree.findClosestLeaf(tree.root, k));
        k = 'E';
        System.out.println("Distace of the closest key from " + k + " is "
                            + tree.findClosestLeaf(tree.root, k));
        k = 'B';
        System.out.println("Distace of the closest key from " + k + " is "
                             + tree.findClosestLeaf(tree.root, k));
  
    }
}
