package abc.xyz.binarytree;

//remove all nodes which don�t lie in any path with sum>= k
public class RemoveOutOfRangeNode {

	Node root;
	void inorder(Node node){
		if(node == null) return ;
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}
	
	Node prune(Node node, int sum){
		
		if(node == null)
			return null;
		node.left = prune(node.left, sum-node.data);
		node.right = prune(node.right, sum-node.data);
		
		if(node.left == null && node.right ==null){
			if(node.data < sum){
			node  = null;
			return null;
			}
		}
		return node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveOutOfRangeNode tree=new RemoveOutOfRangeNode();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		
		tree.inorder(tree.root);
		Node temp=tree.prune(tree.root,8);
		System.out.println();
		tree.inorder(temp);
		
	}
}
