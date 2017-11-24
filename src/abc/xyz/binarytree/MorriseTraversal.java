package abc.xyz.binarytree;

public class MorriseTraversal {
 Node root;
	void MorrisTraversal(Node node){
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
					curr=curr.left;
				}
				else{
					pre.right=null;
					System.out.print(curr.data + " ");
					curr=curr.right;
				}
			}
				
				
		}
	}
	public static void main(String args[]) 
    {
        /* Constructed binary tree is
               1
             /   \
            2      3
          /  \
        4     5
        */
		MorriseTraversal tree = new MorriseTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
          
        tree.MorrisTraversal(tree.root);
    }
}
