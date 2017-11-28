package abc.xyz.BST;

public class SecondLargestNode {
	Node root;
	void secondLargestUtil(Node node, count c){
		if(node == null || c.count >=2)
			return;
		secondLargestUtil(node.right, c);
		c.count++;
		
		if(c.count == 2){
			System.out.print(node.data +" ");
			return;
		}
		secondLargestUtil(node.left, c);	
	}
	void secondLargest(){
		count c = new count();
		secondLargestUtil(root, c);
	}
	Node insertRec(Node node, int data){
		if(node == null){
			node = new Node(data);
			return  node;
		}
		if(data < node.data)
			node.left = insertRec(node.left, data);
		else
			node.right = insertRec(node.right, data);
		return node;
	}
	void insert(int data){
		root=insertRec(root, data);
	}


public static void main(String[] args)
{
	SecondLargestNode tree = new SecondLargestNode();
     
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
tree.secondLargest();
}
}
