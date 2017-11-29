package abc.xyz.BST;


class sum_1{
	int sum = 0;
}

public class AddGreaterValue1 {

	Node root;
	
	void modifyBSTUtil(Node node, sum_1 s){
		if(node==null)
			return;
		modifyBSTUtil(node.right, s);
		s.sum +=node.data;
		node.data = s.sum;
		modifyBSTUtil(node.left, s);
	}
	void modifyBST(Node node){
		sum_1 s = new sum_1();
		modifyBSTUtil(node,s);
	}
	
	void inorder(Node node){
		if(node == null)
			return;
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
	Node insert(Node node, int data){
		if(node == null)
			return new Node(data);
		if(node.data > data)
			node.left = insert(node.left, data);
		else
			node.right = insert(node.right, data);
		return node;
	}
	void insert(int data){
		root = insert(root, data);
	}
	
	public static void main(String[] args)
    {
		AddGreaterValue1 tree = new AddGreaterValue1();
         
          /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
 
        tree.modifyBST(tree.root);
         
        // print inoder tarversal of the modified BST
        tree.inorder(tree.root);
    }
}
