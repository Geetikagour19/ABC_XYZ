package abc.xyz.binarytree;
class Index{
	int index;
}
public class ConstructTree_postIn {

	Node node;
	Node buildTreeUtil(int in[], int post[], int start, int end, Index postIndex){
		
		if(start>end)
			return null;
		Node node = new Node(post[postIndex.index]);
		postIndex.index--;
		
		if(start == end)
			return node;
		
		int iIndex = search(in, start, end, node.data);
		node.right = buildTreeUtil(in, post, iIndex+1, end, postIndex);
		node.left = buildTreeUtil(in, post, start, iIndex-1, postIndex);
		
		 
		return node;
	}
	
	int search(int in[], int st, int ed, int data){
		int i;
		for (i=st; i<=ed;i++){
			if(in[i]==data)
				break;
		}
		return i;
	}
	Node buildTree(int in[], int post[], int n){
		Index pIndex = new Index();
		pIndex.index = n-1;
		return buildTreeUtil(in, post, 0, n-1, pIndex);
	}
	void preOrder(Node node){
		if(node==null) return ;
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	public static void main(String[] args) 
    {
		ConstructTree_postIn tree = new ConstructTree_postIn();
        int in[] = new int[]{4, 8, 2, 5, 1, 6, 3, 7};
        int post[] = new int[]{8, 4, 5, 2, 6, 7, 3, 1};
        int n = in.length;
        Node node = tree.buildTree(in, post, n);
        System.out.println("Preorder of the constructed tree : ");
        tree.preOrder(node);
    }
}
