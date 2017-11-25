package abc.xyz.binarytree;

public class ConstructTree_givenParentArr {
	Node root;
	void createdNode(int parent[], int i, Node created[]){
		if(created[i]!=null)
			return;
		created[i] = new Node(i);
		if(parent[i]==-1){
			root = created[i];
			return;
		}
		if(created[parent[i]] == null){
			createdNode(parent, parent[i], created);
		}
		Node p = created[parent[i]];
		if(p.left == null)
			p.left=created[i];
		else
			p.right=created[i];
		
	}
	Node createTree(int parent[], int n){
		Node [] created = new Node[n];
		for(int i=0;i<n;i++)
			created[i]=null;
		for(int i=0;i<n;i++)
			createdNode(parent, i, created);
		return root;
	}
	
	
	void inorder(Node node){
		if(node !=  null){
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);}
	}
	 void newLine(){
		 System.out.println(" ");;
	 }
	
	public static void main(String[] args) 
    {
  
		ConstructTree_givenParentArr tree = new ConstructTree_givenParentArr();
        int parent[] = new int[]{-1, 0, 0, 1, 1, 3, 5};
        int n = parent.length;
        Node node = tree.createTree(parent, n);
        System.out.println("Inorder traversal of constructed tree ");
        tree.inorder(node);
      //  tree.newLine();
    }
}
