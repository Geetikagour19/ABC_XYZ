package abc.xyz.binarytree;

public class MorrisPreOrder {
Node root;
void morrisTraversalPreorder(){
	morrisTraversalPreorder(root);
}
void morrisTraversalPreorder(Node node){
	Node curr, pre;
	if(node==null)
		return;
	curr=node;
	while(curr!=null){
		if(curr.left==null){
			System.out.print(curr.data + " ");
			curr=curr.right;
		}
		else{
			pre=curr.left;
			while(pre.right!=null && pre.right!=curr)
				pre=pre.right;
			
			if(pre.right==null){
				pre.right=curr;
				System.out.print(curr.data + " ");
				curr=curr.left;
			}
			else{
				pre.right=null;
				
				curr=curr.right;
			}
		}
			
			
	}
}
	public static void main(String args[]) {
		MorrisPreOrder tree = new MorrisPreOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(11);
        tree.morrisTraversalPreorder();
        System.out.println("");
}
}
