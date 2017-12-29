package abc.xyz.LinkedList;

public class BinaryTreeToDLL {

	Node root;
	Node head;
	static Node prev = null;
	void BinaryTree2DoubleLinkedList(Node node){
		if(node==null)
			return;
		BinaryTree2DoubleLinkedList(node.left);
		if(prev==null)
			head=node;
		else{
			node.left=prev;
			prev.right=node;
		}
		prev=node;
		BinaryTree2DoubleLinkedList(node.right);
	}
	void printList(Node node)
    {
        while (node != null) 
        {
            System.out.print(node.data + " ");
            node = node.right;
        }
    }
  
    // Driver program to test above functions
    public static void main(String[] args) 
    {
        // Let us create the tree as shown in above diagram
    	BinaryTreeToDLL tree = new BinaryTreeToDLL();
        tree.root = new Node(10);
        tree.root.left = new Node(12);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(25);
        tree.root.left.right = new Node(30);
        tree.root.right.left = new Node(36);
  
        // convert to DLL
        tree.BinaryTree2DoubleLinkedList(tree.root);
          
        // Print the converted List
        tree.printList(tree.head);
  
    }
}
