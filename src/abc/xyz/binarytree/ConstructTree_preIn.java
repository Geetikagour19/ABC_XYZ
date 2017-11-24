package abc.xyz.binarytree;

class Node1 
{
    char data;
    Node1 left, right;
  
    Node1(char item) 
    {
        data = item;
        left = right = null;
    }
}
public class ConstructTree_preIn {

	Node1 root;
	static int preIndex = 0;
	Node1 buildTree(char in[], char pre[], int inStart, int inEnd){
		
		if(inStart > inEnd)
			return null;
		Node1 node = new Node1 (pre[preIndex++]);
		
		if(inStart == inEnd)
			return node;
		
		int inIndex = search(in, inStart, inEnd, node.data);
	
		node.left=buildTree(in, pre, inStart, inIndex-1);
		node.right=buildTree(in, pre, inIndex+1, inEnd);
		return node;
	}
	
	int search(char in[], int start, int end, char value){
		int i;
		for(i = start; i<= end; i++){
			if(in[i] == value)
				return i;
		}
		return i;
	}
	
	void printInorder(Node1 node){
		if(node == null) return;
		printInorder(node.left);
		System.out.print(node.data + " ");
		printInorder(node.right);
	}
	
	public static void main(String args[])
	{
		ConstructTree_preIn tree = new ConstructTree_preIn();
		
        char in[] = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char pre[] = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
        int len = in.length;
        Node1 root = tree.buildTree(in, pre, 0, len - 1);
  
        // building the tree by printing inorder traversal
        System.out.println("Inorder traversal of constructed tree is : ");
        tree.printInorder(root);
    }
}
