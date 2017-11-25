package abc.xyz.binarytree;

public class ReversAlternateLevel {

	Node root;
	
	void printInorder(){
		printInorder(root);
	}
	void printInorder(Node node){
		if(node == null)
			return;
		printInorder(node.left);
		System.out.print(node.data + " ");
	}
	
	void reverseAlternate(Node node){
		
		preOrder(node.left, node.right, 0);
		
	}
	
	void preOrder(Node n1, Node n2, int lvl){
		
		if(n1==null && n2 == null)
			return;
		if(lvl%2 == 0){
			int temp = n1.data;
			n1.data = n2.data;
			n2.data = temp;
		}
		preOrder(n1.left, n2.right, lvl+1);
		preOrder(n1.right, n2.left, lvl+1);
	}
	public static void main(String args[]) {
		ReversAlternateLevel tree = new ReversAlternateLevel();
        tree.root = new Node('a');
        tree.root.left = new Node('b');
        tree.root.right = new Node('c');
        tree.root.left.left = new Node('d');
        tree.root.left.right = new Node('e');
        tree.root.right.left = new Node('f');
        tree.root.right.right = new Node('g');
        tree.root.left.left.left = new Node('h');
        tree.root.left.left.right = new Node('i');
        tree.root.left.right.left = new Node('j');
        tree.root.left.right.right = new Node('k');
        tree.root.right.left.left = new Node('l');
        tree.root.right.left.right = new Node('m');
        tree.root.right.right.left = new Node('n');
        tree.root.right.right.right = new Node('o');
        System.out.println("Inorder Traversal of given tree");
        tree.printInorder();
 
        tree.reverseAlternate(tree.root);
        System.out.println("");
        System.out.println("");
        System.out.println("Inorder Traversal of modified tree");
        tree.printInorder();
    }
}
