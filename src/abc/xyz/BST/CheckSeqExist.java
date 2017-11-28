package abc.xyz.BST;
class Index1{
	int index = 0;
}
public class CheckSeqExist {

	static Node root;
	
	void seqExistUtil(Node node, int arr[], Index1 index){
		
		if(node == null)
			return;
		seqExistUtil(node.left, arr, index);
		
		if(node.data == arr[index.index])
			index.index++;
		//System.out.println(index.index);
		seqExistUtil(node.right, arr, index);
	}
	boolean seqExist(Node node,int arr[], int n){
		//System.out.println("inside seqExist");
		Index1 index = new Index1();
		seqExistUtil(node, arr, index);
		return (index.index == n);
	}
	Node insertRec(Node node, int data){
		if(node == null){
			node = new Node(data);
			return node;
		}
		if(data < node.data)
			node.left = insertRec(node.left, data);
		else
			node.right = insertRec(node.right, data);
		return node;
	}
	void insert(int data){
	 root = insertRec(root, data);
	}
	static void inorder(Node node){
		if(node ==  null)
			return ;
		inorder(node.left);
		System.out.print(node.data+ " ");
		inorder(node.right);
			
	}
	public static void main(String[] args)
	{
		CheckSeqExist tree = new CheckSeqExist();
	     
	    /* Let us create following BST
	          50
	       /     \
	      30      70
	     /  \    /  \
	   20   40  60   80 */
	    tree.insert(8);
	    tree.insert(10);
	    tree.insert(3);
	    tree.insert(6);
	    tree.insert(1);
	    tree.insert(4);
	    tree.insert(7);
	    tree.insert(14);
	    tree.insert(13);
	    int seq[] = {4, 6, 8, 14};
	    int size = seq.length;
	 //   System.out.println(size);
	    inorder(root);
	    System.out.println("");
	if(tree.seqExist(root, seq, size))
		System.out.println("Sequence Exist");
	else
		System.out.println("Not exist");
	}
}
