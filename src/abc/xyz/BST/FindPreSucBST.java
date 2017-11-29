package abc.xyz.BST;

public class FindPreSucBST {
 
	Node root, pre, suc;
	
	void findPreSuc(Node node, int data){
		
		if(node == null)
			return;
		if(node.data == data){
			if(node.left != null){
				Node temp = node.left;
				while(temp.right!=null)
					temp=temp.right;
				pre = temp;
			}
			
			if(node.right != null){
				Node temp = node.right;
				while(temp.left != null)
					temp=temp.left;
				suc = temp;
			}
			
			return;
		}
		
		if(node.data  > data){
			suc = node;
			findPreSuc(node.left, data);
		}
		else
		{
			pre = node;
			findPreSuc(node.right, data);
		}
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
		FindPreSucBST tree = new FindPreSucBST();
         int key = 65;
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
 
        tree.findPreSuc(tree.root, key);
        
        System.out.println("");
        System.out.println("predecessor : "+tree.pre.data);
        System.out.println("sucsessor : "+tree.suc.data);
        
    }
}
