package abc.xyz.binarytree;

public class ConstructTree_prePost {

	Node root;
	static int preIndex;
	
	static Node constructTreeUtil(int pre[], int post[], int start, int end, int size){
		
		if(start> end || preIndex >= size)
			return null;
		
		Node node = new Node(pre[preIndex]);
		preIndex++;
		if(start==end || preIndex >= size)
			return node;
		int i;
		for(i=start; i<=end; i++){
			if(post[i] == pre[preIndex])
				break;
		}
		
		if(i<=end){
			node.left = constructTreeUtil(pre, post, start, i, size);
			node.right = constructTreeUtil(pre, post, i+1, end, size);
		}
			return node;
	}
	static Node constructTree(int pre[], int post[], int size){
		preIndex = 0;
		return constructTreeUtil(pre, post, 0, size-1, size);
	}
	static void printInorder(Node root) 
    {
        if (root == null)
            return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }
 
    public static void main(String[] args) 
    {
 
        int pre[] = { 1, 2, 4, 8, 9, 5, 3, 6, 7 };
        int post[] = { 8, 9, 4, 5, 2, 6, 7, 3, 1 };
 
        int size = pre.length;
        Node root = constructTree(pre, post, size);
 
        System.out.println("Inorder traversal of the constructed tree:");
        printInorder(root);
    }
}
