package abc.xyz.BST;

public class InorderSuccessorInBST {
	
	Node getInOrderSuccessor(Node node, int data){
		Node successor = null;
		Node current = node;
		
		while(current.data != data){
			if(current.data > data){
				successor = current;
				current = current.left;
			}
			else 
				current = current.right;
		}
		
		if(current.right!= null){
			successor = current.right;
			while(successor.left != null){
				successor = successor.left;
			}
		}
		return successor;
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
	
	
	public static void main(String[] args)
    {
		InorderSuccessorInBST tree = new InorderSuccessorInBST();
        Node root = null;
        root = tree.insert(root, 4);
        tree.insert(root, 2);
        tree.insert(root, 1);
        tree.insert(root, 3);
        tree.insert(root, 6);
        tree.insert(root, 5);
        
        Node temp = tree.getInOrderSuccessor(root , 4);
        if(temp!=null)
            System.out.println("The inorder succesor is " + temp.data );
        else
            System.out.println("The inorder succesor is null");
    }
}
