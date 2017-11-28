package abc.xyz.BST;
class Index{
	int index = 0;
}
public class Construct_BST_GIvenPreOrder {
	
	Node root;
	Index index = new Index();
	Node constructTreeUtil(int pre[], Index preIndex, int key, int min, int max, int size){
		if(preIndex.index >= size)
			return null;
		
		Node node = null;
		if(key > min && key < max){
			node = new Node(pre[preIndex.index]);
			preIndex.index++;
			
		
		
		if(preIndex.index < size){
			node.left = constructTreeUtil(pre, preIndex, pre[preIndex.index], min, key, size);
			node.right = constructTreeUtil(pre, preIndex, pre[preIndex.index], key, max, size);
		}
		}	
		return node;
	}
	
	Node constructTree(int pre[], int size){
		//int preIndex = 0;
		return constructTreeUtil(pre, index, pre[0], Integer.MIN_VALUE, Integer.MAX_VALUE, size);
	}
	
	void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
 
    // Driver program to test above functions
    public static void main(String[] args) {
    	Construct_BST_GIvenPreOrder tree = new Construct_BST_GIvenPreOrder();
        int pre[] = new int[]{10, 5, 1, 7, 40, 50};
        int size = pre.length;
        Node root = tree.constructTree(pre, size);
        System.out.println("Inorder traversal of the constructed tree is ");
        tree.printInorder(root);
    }

}
