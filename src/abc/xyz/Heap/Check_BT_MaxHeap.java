package abc.xyz.Heap;
class node{
	int data;
	node left, right;
	node(int data){
		this.data = data;
		left=right=null;
	}
}
public class Check_BT_MaxHeap {
 node node;
 int countNodes(node node){
	 if(node == null)
		 return 0;
	 return (1+countNodes(node.left)+countNodes(node.right));
 }
 
 boolean isCompleteUtil(node node, int index, int node_count){
	 if(node == null)
		 return true;
	 if(index>=node_count)
		 return false;
	 return (isCompleteUtil(node.left, 2*index+1, node_count)&&isCompleteUtil(node.right, 2*index+2, node_count));
 }
 
 boolean isHeapUtil(node node){
	 if(node.left==null && node.right==null)
		 return true;
	 if(node.right==null){
		 return node.data > node.left.data;
	 }
	 else{
		 if(node.data >=node.left.data && node.data >=node.right.data)
			 return isHeapUtil(node.left) && isHeapUtil(node.right);
		 else
			 return false;
	 }
		 
		 		 
		 
 }
	boolean isHeap(node node){
		if(node ==null)
			return true;
		int node_count = countNodes(node);
		if(isCompleteUtil(node, 0, node_count)==true && isHeapUtil(node)==true)
			return true;
		return false;
	}
	public static void main(String args[])
    {
		Check_BT_MaxHeap bt = new Check_BT_MaxHeap();
         
        node root = new node(10);
        root.left = new node(9);
        root.right = new node(8);
        root.left.left = new node(7);
        root.left.right = new node(6);
        root.right.left = new node(5);
        root.right.right = new node(4);
        root.left.left.left = new node(3);
        root.left.left.right = new node(2);
        root.left.right.left = new node(1);
 
        if(bt.isHeap(root) == true)
            System.out.println("Given binary tree is a Heap");
        else
            System.out.println("Given binary tree is not a Heap");
    }
}
