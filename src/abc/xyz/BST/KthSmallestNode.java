package abc.xyz.BST;

public class KthSmallestNode {

	Node root;
	void kthSmallest(int k){
		count c = new count();
		kthSmallestUtil(root, k, c);
		
	}
	
	void kthSmallestUtil(Node node, int k , count c){
		if(node == null || c.count >= k){
			return ;
		}
		kthSmallestUtil(node.left, k, c);
		c.count++;
		
		if(c.count==k ){
			System.out.print(node.data + " ");
			return;
		}
		kthSmallestUtil(node.right, k, c);
	}
	public void insert(int data)
    {
        this.root = this.insertRec(this.root, data);
    }
     
    /* A utility function to insert a new node 
    with given key in BST */
    Node insertRec(Node node, int data)
    {   
        /* If the tree is empty, return a new node */
        if (node == null) {
            this.root = new Node(data);
            return this.root;
        }
 
        if (data == node.data) {
            return node;
        }
         
        /* Otherwise, recur down the tree */
        if (data < node.data) {
            node.left = this.insertRec(node.left, data);
        } else {
            node.right = this.insertRec(node.right, data);
        }
        return node;
    }
	public static void main(String[] args)
    {
		KthSmallestNode tree = new KthSmallestNode();
         
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
 tree.kthSmallest(2);
 System.out.println("");
        for (int i = 1; i <= 7; i++) {
            tree.kthSmallest(i);
        }
}
}