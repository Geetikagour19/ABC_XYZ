package abc.xyz.BST;
class Max{
	int max = 0;
}
public class largestLessThanN {


	Node root;
	void largestLessNUtil(Node node, int n, Max max){
		if(node == null)
			return;
		if(node.data > n){
			largestLessNUtil(node.left, n, max);
		}else if(node.data==n){
			max.max = n;
			return;
		}else{
			max.max = Math.max(max.max, node.data);
			largestLessNUtil(node.right, n, max);
		}
			
		
		
			
	}
	void largestLessN(int n){
		Max max = new Max();
		largestLessNUtil(root, n, max);
		System.out.print(max.max);
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
	largestLessThanN tree = new largestLessThanN();
     int n = 44;
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
tree.largestLessN(n);
}
}
