package abc.xyz.BST;
class count{
	int count = 0;
}
public class KthLargestNode {

	Node root;
	void kthLargestUtil(Node node, int k , count c){
		if(node == null || c.count >= k)
			return ;
		kthLargestUtil(node.right, k , c);
		c.count++;
		if(c.count == k){
			System.out.print(node.data +" ");
			return;
		}
		kthLargestUtil(node.left, k,c);	
	}
	
	void kthLargest(int k){
		count c = new count();
		kthLargestUtil(this.root, k , c);
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
		KthLargestNode tree = new KthLargestNode();
         
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
 tree.kthLargest(2);
 System.out.println("");
        for (int i = 1; i <= 7; i++) {
            tree.kthLargest(i);
        }
    }
}
