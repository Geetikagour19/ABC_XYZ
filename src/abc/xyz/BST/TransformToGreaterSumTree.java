package abc.xyz.BST;
class Sum1{
	int sum = 0;
}
public class TransformToGreaterSumTree {

	Node root;
	
		Sum1 sum = new Sum1();
	
		
		void transformTreeUtil(Node node, Sum1 sum_ptr){
			if(node == null) return;
			
			transformTreeUtil(node.right, sum_ptr);
			
			sum_ptr.sum += node.data;
			node.data = sum_ptr.sum-node.data;
			
			transformTreeUtil(node.left, sum_ptr);
		}
		Node transformTree(Node node){
			transformTreeUtil(node, sum);
			return node;
		}
	void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
 
    // Driver program to test the above functions
    public static void main(String[] args) {
    	TransformToGreaterSumTree tree = new TransformToGreaterSumTree();
        tree.root = new Node(11);
        tree.root.left = new Node(2);
        tree.root.right = new Node(29);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(7);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(40);
        tree.root.right.right.left = new Node(35);
        
 
        System.out.println("Inorder traversal of given tree ");
        tree.printInorder(tree.root);
        tree.transformTree(tree.root);
        System.out.println("Inorder traversal of modified tree ");
        tree.printInorder(tree.root);
    }
}
