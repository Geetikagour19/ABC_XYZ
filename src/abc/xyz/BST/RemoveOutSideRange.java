package abc.xyz.BST;

public class RemoveOutSideRange {

	Node removeOutsideRange(Node node, int min, int max){
		if(node == null)
			return null;
		node.left = removeOutsideRange(node.left, min, max);
		node.right = removeOutsideRange(node.right, min, max);
		
		if(node.data < min){
			Node lchild = node.right;
			node = null;
			return lchild;
		}
		if(node.data > max){
			Node rchild = node.left;
			node = null;
			return rchild;
		}
		return node;
	}
	void inorder(Node node){
		if(node == null)
			return;
		inorder(node.left);
		System.out.print(node.data+ " ");
		inorder(node.right);
	}
	
	Node insert(Node node, int data){
		if(node == null)
			return new Node(data);
		if(node.data > data){
			node.left = insert(node.left, data);
		}else
			node.right = insert(node.right, data);
		return node;
	}
	public static void main(String[] args)
    {
		RemoveOutSideRange tree = new RemoveOutSideRange();
        Node root = null;
        root = tree.insert(root, 6);
        tree.insert(root, -13);
        tree.insert(root, 14);
        tree.insert(root, -8);
        tree.insert(root, 15);
        tree.insert(root, 13);
        tree.insert(root, 7);
        System.out.println("Inorder traversl of given tree");
        
        tree.inorder(root);
      
        root = tree.removeOutsideRange(root, -10, 13);
        System.out.println(" ");
        System.out.println("Inorder traversl of updated tree");
        
        tree.inorder(root);
    }
}
