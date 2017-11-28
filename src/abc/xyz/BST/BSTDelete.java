package abc.xyz.BST;

public class BSTDelete {

	Node root;
	
	void deleteKey(int key){
		root = deleteRec(root, key);
	}
	
	Node deleteRec(Node node, int key){
		if(node == null) return node;
		
		if(key < node.data)
			node.left= deleteRec(node.left, key);
		else if (key > node.data)
			node.right = deleteRec(node.right, key);
		else{
			if(node.left==null)
				return node.right;
			else if(node.right == null)
				return node.left;
			
			node.data = minValue(node.right);
			
			node.right = deleteRec(node.right, node.data);
		}
		
		return node;
	}
	
	int minValue(Node node){
		int minv = node.data;
		while(node.left!=null){
			minv = node.left.data;
			node=node.left;
			
		}
		return minv;
	}
	
	void insert(int key)
    {
        root = insertRec(root, key);
    }
 
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key)
    {
 
        /* If the tree is empty, return a new node */
        if (root == null)
        {
            root = new Node(key);
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);
 
        /* return the (unchanged) node pointer */
        return root;
    }
 
    // This method mainly calls InorderRec()
    void inorder()
    {
        inorderRec(root);
    }
 
    // A utility function to do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null)
        {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
 
    // Driver Program to test above functions
    public static void main(String[] args)
    {
        BSTDelete tree = new BSTDelete();
 
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
 
        System.out.println("Inorder traversal of the given tree");
        tree.inorder();
 
        System.out.println("\nDelete 20");
        tree.deleteKey(20);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();
 
        System.out.println("\nDelete 30");
        tree.deleteKey(30);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();
 
        System.out.println("\nDelete 50");
        tree.deleteKey(50);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();
    }
}
